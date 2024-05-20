package oops.LibraryManagement;

import java.util.Date;
import java.util.List;

public class LibraryMember extends Member {
    private String name;
    private String memberId;
    boolean membershipStatus;
    private int checkedOutBooksCount;
    private List<BookDetail> checkedOutBooks;
    private List<BookDetail> reservedBooks;

    public LibraryMember(Member member, boolean membershipStatus){
        super(member);
        this.memberId = member.getMemberId();
        this.name = getName();
        this.checkedOutBooksCount = member.getCheckedOutBooksCount();
        this.checkedOutBooks = member.getCheckedOutBooks();
        this.reservedBooks = member.getReservedBooks();
        this.membershipStatus = membershipStatus;
    }

    public boolean isMembershipStatus() {
        return membershipStatus;
    }

    @Override
    public int getCheckedOutBooksCount() {
        return checkedOutBooksCount;
    }

    public void setCheckedOutBooksCount(int checkedOutBooksCount) {
        this.checkedOutBooksCount = checkedOutBooksCount;
    }

    @Override
    public List<BookDetail> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public void setCheckedOutBooks(List<BookDetail> checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }

    @Override
    public List<BookDetail> getReservedBooks() {
        return reservedBooks;
    }

    public void setReservedBooks(List<BookDetail> reservedBooks) {
        this.reservedBooks = reservedBooks;
    }

    public boolean checkoutBook(BookDetail bookDetail) {
        if (checkedOutBooksCount >= 5) return false;
        checkedOutBooks.add(bookDetail);
        checkedOutBooksCount++;
        bookDetail.setAvailable(false);
        bookDetail.setDueDate(new Date(System.currentTimeMillis()+864000000)); // 10 days +
        return true;
    }

    public boolean returnBook(BookDetail bookDetail) {
        if (checkedOutBooks.remove(bookDetail)) {
            checkedOutBooksCount--;
            bookDetail.setAvailable(true);
            return true;
        }
        return false;
    }

    public boolean reserveBook(BookDetail bookDetail) {
        return reservedBooks.add(bookDetail);
    }
}
