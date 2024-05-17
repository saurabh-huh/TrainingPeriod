package oops.LibraryManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Member {
    private String name;
    private String memberId;
    private int checkedOutBooksCount;
    private List<BookItem> checkedOutBooks;
    private List<BookItem> reservedBooks;

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

    // Getters and other necessary methods...
    public String getName() { return name; }
    public String getMemberId() { return memberId; }
    public int getCheckedOutBooksCount() { return checkedOutBooksCount; }
    public List<BookItem> getCheckedOutBooks() { return checkedOutBooks; }
    public List<BookItem> getReservedBooks() { return reservedBooks; }

    public boolean checkoutBook(BookItem bookItem) {
        if (checkedOutBooksCount >= 5) return false;
        checkedOutBooks.add(bookItem);
        checkedOutBooksCount++;
        bookItem.setAvailable(false);
        bookItem.setDueDate(new Date(System.currentTimeMillis()+864000000)); // 10 days +
        return true;
    }

    public boolean returnBook(BookItem bookItem) {
        if (checkedOutBooks.remove(bookItem)) {
            checkedOutBooksCount--;
            bookItem.setAvailable(true);
            return true;
        }
        return false;
    }

    public boolean reserveBook(BookItem bookItem) {
        return reservedBooks.add(bookItem);
    }
}