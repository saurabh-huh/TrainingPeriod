package oops.atmMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// ATM Class
class ATM {
    private Map<Integer, Integer> denominations;

    public ATM() {
        this.denominations = new HashMap<>();
        this.denominations.put(100, 0);
        this.denominations.put(200, 0);
        this.denominations.put(500, 0);
        this.denominations.put(2000, 0);
    }

    public void topUp(int denomination, int count) {
        if (denominations.containsKey(denomination)) {
            denominations.put(denomination, denominations.get(denomination) + count);
        } else {
            System.out.println("Denomination " + denomination + " not supported");
        }
    }

    public Map<Integer, Integer> withdraw(int amount) {
        if (amount <= 0 || !isAmountValid(amount)) {
            System.out.println("Invalid amount");
            return null;
        }

        if (amount > getTotalBalance()) {
            System.out.println("Insufficient balance");
            return null;
        }

        Map<Integer, Integer> withdrawal = new TreeMap<>((a, b) -> b - a);
        int originalAmount = amount;

        for (int denom : new TreeMap<>(denominations).descendingKeySet()) {
            if (denominations.get(denom) > 0 && amount >= denom) {
                int numOfNotes = Math.min(amount / denom, denominations.get(denom));
                if (numOfNotes > 0) {
                    withdrawal.put(denom, numOfNotes);
                    amount -= denom * numOfNotes;
                }
            }
        }

        if (amount != 0) {
            System.out.println("Unable to dispense the exact amount with available denominations");
            return null;
        }

        withdrawal.forEach((denom, count) -> denominations.put(denom, denominations.get(denom) - count));
        return withdrawal;
    }

    public Map<Integer, Integer> getBalance() {
        Map<Integer, Integer> currentBalance = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : denominations.entrySet()) {
            if (entry.getValue() > 0) {
                currentBalance.put(entry.getKey(), entry.getValue());
            }
        }
        return currentBalance;
    }

    public void invalidateDenomination(int denomination) {
        if (denominations.containsKey(denomination)) {
            denominations.remove(denomination);
        } else {
            System.out.println("Denomination " + denomination + " not found");
        }
    }

    public void addNewDenomination(int denomination) {
        if (!denominations.containsKey(denomination)) {
            denominations.put(denomination, 0);
        } else {
            System.out.println("Denomination " + denomination + " already exists");
        }
    }

    private boolean isAmountValid(int amount) {
        int smallestDenom = Integer.MAX_VALUE;
        for (int denom : denominations.keySet()) {
            if (denom < smallestDenom) {
                smallestDenom = denom;
            }
        }
        return amount % smallestDenom == 0;
    }

    private int getTotalBalance() {
        int totalBalance = 0;
        for (Map.Entry<Integer, Integer> entry : denominations.entrySet()) {
            totalBalance += entry.getKey() * entry.getValue();
        }
        return totalBalance;
    }
}

// Demonetization Class
class DemonetizationService {
    private ATM atm;

    public DemonetizationService(ATM atm) {
        this.atm = atm;
    }

    public void invalidateDenomination(int denomination) {
        atm.invalidateDenomination(denomination);
    }

    public void addNewDenomination(int denomination) {
        atm.addNewDenomination(denomination);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        DemonetizationService demonetizationService = new DemonetizationService(atm);
        Scanner sc = new Scanner(System.in);
        // Top up the ATM
        atm.topUp(2000, 20);
        atm.topUp(500, 2);
        atm.topUp(200, 5);
        atm.topUp(100, 10);
        System.out.println("Amount to withdraw: ");
        int amountWithdraw = sc.nextInt();;
        // Withdraw cash
        Map<Integer, Integer> withdrawal = atm.withdraw(amountWithdraw);
        if (withdrawal != null) {
            System.out.println("Withdrawal successful: " + withdrawal);
        }

        // Check balance
        System.out.println("Current ATM balance: " + atm.getBalance());

        // Invalidate 2000 denomination and add 5000 denomination
//        System.out.println("invalidateDenomination: ");
//        int invalidateDenomination = sc.nextInt();
//        demonetizationService.invalidateDenomination(invalidateDenomination);
//        System.out.println("addDenomination: ");
//        int addDenomination = sc.nextInt();
//        System.out.println("count");
//        int count = sc.nextInt();
//        demonetizationService.addNewDenomination(addDenomination);
//
//        // Top up the ATM with new denomination
//        atm.topUp(addDenomination, count);
//
//        // Check balance after changes
//        System.out.println("ATM balance after demonetization and adding new denomination: " + atm.getBalance());

        // Withdraw cash with new denomination
        System.out.println("Amount to withdraw:");
        amountWithdraw = sc.nextInt();
        withdrawal = atm.withdraw(amountWithdraw);
        if (withdrawal != null) {
            System.out.println("Withdrawal successful: " + withdrawal);
        }

        // Final balance check
        System.out.println("Final ATM balance: " + atm.getBalance());
    }
}

