package oops.ParkingLot;

import java.sql.Time;
import java.time.Instant;
import java.util.ArrayList;

public class ParkingLotManagement {
    public static void main(String[] args) {
        Admin admin = new Admin();


    }

}
// user class is created to create the users



class User{
    String name;
    int age;
    long mobNum;
    public User(){};
    public User(String name,int age,long mobNum){
        this.name = name;
        this.age = age;
        this.mobNum = mobNum;
    }
// getter and setter methods for the user set all the details of user such as name age and mob number.
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMobNum(long mobNum) {
        this.mobNum = mobNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getMobNum() {
        return mobNum;
    }
}


class UserManagement  {

    void addUser(String name,int age,long mobNum){

    };
    void updateUser(String name){

    };
    void deleteUser(String name){

    };

}

// Floor management check the availability of the parking slot and can add floor, spots on the particuler floor
// and delete the spots and floor.


class FloorManagement{
    public FloorManagement(){};
    ArrayList<ArrayList<Boolean>> parkingLot;
    public FloorManagement(ArrayList<ArrayList<Boolean>> parkingLot){

    }
    // Display no of vacant slot in the current floor.
    void displayNoVacantSlot(int noOfFloor){
        int cnt = 0;
        for(int i=0;i<parkingLot.get(noOfFloor).size();i++){
            if(parkingLot.get(noOfFloor).get(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public boolean isSpot(ArrayList<ArrayList<Boolean>> parkingLot){

        for(int i=0;i<parkingLot.size();i++){
            for(int j=0;j<parkingLot.get(0).size();j++)
                if(!parkingLot.get(i).get(j)){
                    return true;
                }
        }
        return false;
    }
    // can check the availability of the slots
    public void SpotManagement(){
        if(isSpot( parkingLot)){
            System.out.println("Can Parked");
        }else {
            System.out.println("Parking Full");
        }
    }
    //remove the floor
    public void removeFloor(int noOfFloor){
        parkingLot.remove(noOfFloor);
    }
    public void deleteSpot(int noOfFloor,int capacity){
        int cap = parkingLot.get(noOfFloor).size();
        parkingLot.add(noOfFloor,new ArrayList<>(cap-capacity));
    }
    public void addFloor(){
        parkingLot.add(new ArrayList<>(100));
    }
    public void addSpot(int noOfFloor,int capacity){
        int cap = parkingLot.get(noOfFloor).size();
        parkingLot.add(noOfFloor,new ArrayList<>(cap+capacity));
    }
}
class ParkingAttendent{

}

class Ticket{
    int ticketId;
    Time inTime;
    Time outTime;
    public Ticket(){};
    public Ticket(int ticketId,Time inTime,Time outTime){
        this.inTime = inTime;
        this.outTime = outTime;
        this.ticketId = ticketId;
    }
}

class TicketManagement {


    public TicketManagement(int ticketId,Time inTime,Time outTime){
        Ticket ticket = new Ticket(ticketId,inTime,outTime);
        generateTicket();
    }
    public void generateTicket(){
        int totalTime = 1;
        PaymentManagement paymentManagement = new PaymentManagement();
        double fare = paymentManagement.calculateFare(totalTime);
        System.out.println(fare+"Ticket generated");
    }

}
class VehicleType{
    public enum Vehicle_Type{car, truck, van, motorcycle}
    String vehicle;
    public void setVehicle_Type(String type){
        this.vehicle = type;
    }
    public String getVehicle_Type(){
        return vehicle;
    }
}



class ParkingLotManage {
    int parkingLotCapacity;
    int parkingLotId;
    boolean parkingLotPaymentStatus;
    public ParkingLotManage(int parkingLotCapacity,int parkingLotId,boolean parkingLotPaymentStatus){
        this.parkingLotCapacity = parkingLotCapacity;
        this.parkingLotId = parkingLotId;
        this.parkingLotPaymentStatus = parkingLotPaymentStatus;
        FloorManagement floorManagement = new FloorManagement();

    }

    public int getParkingLotCapacity() {
        return parkingLotCapacity;
    }

    public void setParkingLotCapacity(int parkingLotCapacity) {
        this.parkingLotCapacity = parkingLotCapacity;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public boolean isParkingLotPaymentStatus() {
        return parkingLotPaymentStatus;
    }

    public void setParkingLotPaymentStatus(boolean parkingLotPaymentStatus) {
        this.parkingLotPaymentStatus = parkingLotPaymentStatus;
    }
}

class PaymentManagement extends Ticket{
    String vehicleType;
    public PaymentManagement(){};
    public PaymentManagement(int ticketId,Time inTime,Time outTime){
        super(ticketId, inTime,outTime);


    }
    double fare;
    public double calculateFare(int noHourSpend){
        if(noHourSpend <= 1) fare =  4;
        else if(noHourSpend == 2) fare = 7.5;
        else if(noHourSpend == 3) fare = 11;
        else fare = 11 + (2.5 * Math.ceil(noHourSpend-3));
        return fare;
    }
}

