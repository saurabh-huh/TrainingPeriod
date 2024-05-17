package oops.ParkingLotM;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract class Vehicle {
    private String licensePlate;
    private VehicleType type;

    public Vehicle(String licensePlate, VehicleType type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return type;
    }
}

enum VehicleType {
    CAR, TRUCK, VAN, MOTORCYCLE
}

class Car extends Vehicle {
    public Car(String licensePlate) {
        super(licensePlate, VehicleType.CAR);
    }
}

class Truck extends Vehicle {
    public Truck(String licensePlate) {
        super(licensePlate, VehicleType.TRUCK);
    }
}

class Van extends Vehicle {
    public Van(String licensePlate) {
        super(licensePlate, VehicleType.VAN);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String licensePlate) {
        super(licensePlate, VehicleType.MOTORCYCLE);
    }
}

class ParkingSpot {
    private String number;
    private ParkingSpotType type;
    private Vehicle vehicle;
    private boolean isAvailable;

    public ParkingSpot(String number, ParkingSpotType type) {
        this.number = number;
        this.type = type;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isAvailable = true;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getNumber() {
        return number;
    }

    public ParkingSpotType getType() {
        return type;
    }
}

enum ParkingSpotType {
    COMPACT, LARGE, HANDICAPPED, MOTORCYCLE, ELECTRIC
}

class Ticket {
    private String ticketNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private ParkingSpot parkingSpot;
    private double amount;
    private boolean isPaid;

    public Ticket(String ticketNumber, ParkingSpot parkingSpot) {
        this.ticketNumber = ticketNumber;
        this.entryTime = LocalDateTime.now();
        this.parkingSpot = parkingSpot;
        this.isPaid = false;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void markAsPaid() {
        this.isPaid = true;
    }
}

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void pay();
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        // process credit card payment
        System.out.println("Paid " + amount + " using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class CashPayment extends Payment {
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        // process cash payment
        System.out.println("Paid " + amount + " in cash.");
    }
}

class DisplayBoard {
    private Map<ParkingSpotType, Integer> freeSpots;

    public DisplayBoard() {
        freeSpots = new HashMap<>();
        for (ParkingSpotType type : ParkingSpotType.values()) {
            freeSpots.put(type, 0);
        }
    }

    public void updateFreeSpots(ParkingSpotType type, int count) {
        freeSpots.put(type, count);
    }

    public void showFreeSpots() {
        System.out.println("Free parking spots:");
        for (Map.Entry<ParkingSpotType, Integer> entry : freeSpots.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

class ParkingFloor {
    private int number;
    private List<ParkingSpot> parkingSpots;
    private DisplayBoard displayBoard;

    public ParkingFloor(int number) {
        this.number = number;
        this.parkingSpots = new ArrayList<>();
        this.displayBoard = new DisplayBoard();
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpots.add(spot);
        updateDisplayBoard();
    }

    public void removeParkingSpot(String spotNumber) {
        parkingSpots.removeIf(spot -> spot.getNumber().equals(spotNumber));
        updateDisplayBoard();
    }

    public DisplayBoard getDisplayBoard() {
        return displayBoard;
    }

    private void updateDisplayBoard() {
        int compactCount = 0;
        int largeCount = 0;
        int handicappedCount = 0;
        int motorcycleCount = 0;
        int electricCount = 0;

        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable()) {
                switch (spot.getType()) {
                    case COMPACT:
                        compactCount++;
                        break;
                    case LARGE:
                        largeCount++;
                        break;
                    case HANDICAPPED:
                        handicappedCount++;
                        break;
                    case MOTORCYCLE:
                        motorcycleCount++;
                        break;
                    case ELECTRIC:
                        electricCount++;
                        break;
                }
            }
        }

        displayBoard.updateFreeSpots(ParkingSpotType.COMPACT, compactCount);
        displayBoard.updateFreeSpots(ParkingSpotType.LARGE, largeCount);
        displayBoard.updateFreeSpots(ParkingSpotType.HANDICAPPED, handicappedCount);
        displayBoard.updateFreeSpots(ParkingSpotType.MOTORCYCLE, motorcycleCount);
        displayBoard.updateFreeSpots(ParkingSpotType.ELECTRIC, electricCount);
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public int getNumber() {
        return 0;
    }
}

class ParkingLot {
    private String name;
    private List<ParkingFloor> floors;
    private List<EntrancePanel> entrancePanels;
    private List<ExitPanel> exitPanels;
    private static final String ADMIN_USERNAME = "admin";

    public ParkingLot(String name) {
        this.name = name;
        this.floors = new ArrayList<>();
        this.entrancePanels = new ArrayList<>();
        this.exitPanels = new ArrayList<>();
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public void removeFloor(int floorNumber) {
        floors.removeIf(floor -> floor.getNumber() == floorNumber);
    }

    public void addEntrancePanel(EntrancePanel panel) {

        entrancePanels.add(panel);
    }

    public void addExitPanel(ExitPanel panel) {
        exitPanels.add(panel);
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public List<EntrancePanel> getEntrancePanels() {
        return entrancePanels;
    }

    public List<ExitPanel> getExitPanels() {
        return exitPanels;
    }

    public boolean isFull() {
        for (ParkingFloor floor : floors) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if (spot.isAvailable()) {
                    return false; // Parking lot is not full
                }
            }
        }
        return true; // All spots are occupied
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot("MyParkingLot");

        // Create and add parking floors
        ParkingFloor floor1 = new ParkingFloor(1);
        ParkingFloor floor2 = new ParkingFloor(2);
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        // Add parking spots to each floor
        floor1.addParkingSpot(new ParkingSpot("A1", ParkingSpotType.COMPACT));
        floor1.addParkingSpot(new ParkingSpot("A2", ParkingSpotType.LARGE));
        floor1.addParkingSpot(new ParkingSpot("A3", ParkingSpotType.HANDICAPPED));
        floor2.addParkingSpot(new ParkingSpot("B1", ParkingSpotType.MOTORCYCLE));
        floor2.addParkingSpot(new ParkingSpot("B2", ParkingSpotType.ELECTRIC));

        // Display initial free spots
        floor1.getDisplayBoard().showFreeSpots();
        floor2.getDisplayBoard().showFreeSpots();

        // Simulate vehicle parking and leaving
        Vehicle car1 = new Car("ABC123");
        Vehicle motorcycle1 = new Motorcycle("DEF456");

        ParkingSpot spot1 = floor1.getParkingSpots().get(0);
        ParkingSpot spot2 = floor2.getParkingSpots().get(0);

        if (spot1.isAvailable()) {
            spot1.parkVehicle(car1);
        }

        if (spot2.isAvailable()) {
            spot2.parkVehicle(motorcycle1);
        }

        // Display updated free spots
        floor1.getDisplayBoard().showFreeSpots();
        floor2.getDisplayBoard().showFreeSpots();

        // Simulate ticket issuance and payment
        EntrancePanel entrancePanel = new EntrancePanel();
        Ticket ticket = entrancePanel.getTicket(car1, spot1);
        if (ticket != null) {
            ExitPanel exitPanel = new ExitPanel();
            exitPanel.scanTicket(ticket);
            Payment payment = new CreditCardPayment(ticket.getAmount(), "1234-5678-9012-3456");
            payment.pay();
        }
    }
}

class EntrancePanel {
    public Ticket getTicket(Vehicle vehicle, ParkingSpot spot) {
        if (!spot.isAvailable()) {
            System.out.println("Spot is not available.");
            return null;
        }

        spot.parkVehicle(vehicle);
        return new Ticket("T12345", spot);
    }
}

class ExitPanel {
    public void scanTicket(Ticket ticket) {
        ticket.setExitTime(LocalDateTime.now());
        double amount = calculateAmount(ticket);
        ticket.setAmount(amount);
        ticket.markAsPaid();
        System.out.println("Ticket " + ticket.getTicketNumber() + " scanned. Amount due: " + amount);
    }

    private double calculateAmount(Ticket ticket) {
        // Calculate amount based on duration and parking rates
        return 10.0; // Dummy calculation for demonstration
    }
}
