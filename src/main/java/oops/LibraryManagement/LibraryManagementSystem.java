package oops.LibraryManagement;

import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        NotificationService notificationService = new NotificationService();

        // Adding a librarian
        Librarian librarian = new Librarian("John Doe", "L001");
        library.addMember(librarian);

        // Adding some books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Novel", "1925", "ISBN0001");
        BookItem bookItem1 = new BookItem("B001", "R01");
        book1.getBookItems().add(bookItem1);
        librarian.addBook(book1, library);

        Book book2 = new Book("The Great", "George Orwell", "Dystopian", "1949", "ISBN0002");
        BookItem bookItem2 = new BookItem("B002", "R02");
        book2.getBookItems().add(bookItem2);
        librarian.addBook(book2, library);

        // Registering a new member
        Member member = new Member("Jane Smith", "M001");
        library.addMember(member);

        // Searching books by title
        System.out.println("Searching books by title '1984':");
        List<Book> foundBooks = library.searchByTitle("1984");
        for (Book book : foundBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

//        // Member checks out a book
//        if (member.checkoutBook(bookItem2)) {
//            System.out.println(member.getName() + " checked out " + book2.getTitle());
//        } else {
//            System.out.println(member.getName() + " could not check out " + book2.getTitle());
//        }
//
//
//        // Returning the book
//        if (member.returnBook(bookItem2)) {
//            System.out.println(member.getName() + " returned " + book2.getTitle());
//        } else {
//            System.out.println(member.getName() + " could not return " + book2.getTitle());
//        }
    }
}
