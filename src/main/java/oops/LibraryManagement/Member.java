package oops.LibraryManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Member {
    private String name;
    private String memberId;
    private int checkedOutBooksCount;
    private List<BookDetail> checkedOutBooks;
    private List<BookDetail> reservedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.checkedOutBooksCount = 0;
        this.checkedOutBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }
    public Member(Member member){
        this.name = member.name;
        this.memberId = member.memberId;
        this.checkedOutBooksCount = 0;
        this.checkedOutBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    // Getters and setter methods
    public String getName() { return name; }
    public String getMemberId() { return memberId; }
    public int getCheckedOutBooksCount() { return checkedOutBooksCount; }
    public List<BookDetail> getCheckedOutBooks() { return checkedOutBooks; }
    public List<BookDetail> getReservedBooks() { return reservedBooks; }

//    public boolean checkoutBook(BookDetail bookDetail) {
//        if (checkedOutBooksCount >= 5) return false;
//        checkedOutBooks.add(bookDetail);
//        checkedOutBooksCount++;
//        bookDetail.setAvailable(false);
//        bookDetail.setDueDate(new Date(System.currentTimeMillis()+864000000)); // 10 days +
//        return true;
//    }
//
//    public boolean returnBook(BookDetail bookDetail) {
//        if (checkedOutBooks.remove(bookDetail)) {
//            checkedOutBooksCount--;
//            bookDetail.setAvailable(true);
//            return true;
//        }
//        return false;
//    }
//
//    public boolean reserveBook(BookDetail bookDetail) {
//        return reservedBooks.add(bookDetail);
//    }
}