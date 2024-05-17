package oops.ParkingLot;

import java.util.ArrayList;
// Main admin class which extends the user so that admin can perform the modifications in the user database.
public class Admin extends User {
    String role;
    public Admin(){}
    ArrayList<ArrayList<Boolean>> parkingLot;
    public Admin(String name,int age,long mobNum,String role){
        super(name, age, mobNum);
        this.role = "Admin";
    }

    FloorManagement floorManagement = new FloorManagement();


// admin can modify,add,delete the users.

    //can update modify pakringLotDetails with object of parkingLot
    int parkingLotCapacity;
    int parkingLotId;
    boolean parkingLotPaymentStatus;
    ParkingLotManage parkingLotManage = new ParkingLotManage(parkingLotCapacity,parkingLotId,parkingLotPaymentStatus);


    // admin can perform all the actions
    // first check the role if role is admin than actions can be perform
    public void actionPerform(String role){
        if(role.equals("Admin")) {
            FloorManagement floorManagement = new FloorManagement();
            floorManagement.isSpot(parkingLot);
            floorManagement.addFloor();
            floorManagement.removeFloor(4);
            floorManagement.addSpot(3, 42);
            floorManagement.deleteSpot(3, 40);
        }
    }
}
