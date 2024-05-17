package oops.libraryManage;

import java.util.Date;
import java.util.List;

public class Memeber {
    String name;
    int memberId;
    int checkOutBooksCount;
    List<BookDetail> checkOutBooks;
    List<BookDetail> reserveBooks;

    public Memeber(String name, int memberId, int checkOutBooksCount, List<BookDetail> checkOutBooks, List<BookDetail> reserveBooks) {
        this.name = name;
        this.memberId = memberId;
        this.checkOutBooksCount = 0;
        this.checkOutBooks = checkOutBooks;
        this.reserveBooks = reserveBooks;
    }

    public List<BookDetail> getReserveBooks() {
        return reserveBooks;
    }

    public List<BookDetail> getCheckOutBooks() {
        return checkOutBooks;
    }

    public int getCheckOutBooksCount() {
        return checkOutBooksCount;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public boolean checkoutBook(BookDetail bookDetail){
        if(checkOutBooksCount >= 5) return false;
        checkOutBooks.add(bookDetail);
        checkOutBooksCount++;
        bookDetail.setAvailable(false);
        bookDetail.setDueDate(new Date(System.currentTimeMillis()+864000000));
        return true;
    }

}
