package oops.LibraryManagement;

import java.util.Date;

class BookDetail {
    private String barcode;
    private boolean isAvailable;
    private Date dueDate;
    private String rackNumber;

    public BookDetail(String barcode, String rackNumber) {
        this.barcode = barcode;
        this.rackNumber = rackNumber;
        this.isAvailable = true;
    }

    // Getters and other necessary methods...
    public String getBarcode() { return barcode; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }
    public Date getDueDate() { return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }
}
