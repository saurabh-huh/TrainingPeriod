package oops.libraryManage;

import java.util.Date;

public class BookDetail {
    boolean isAvailable;
    String barcode;
    String rackNumber;
    Date dueDate;
    public BookDetail(String barcode,String rackNumber){
        this.barcode = barcode;
        this.rackNumber = rackNumber;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getBarcode() {
        return barcode;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
