package oops.LibraryManagement;

import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        NotificationService notificationService = new NotificationService();

        // Adding a librarian
        Librarian librarian = new Librarian("Saurabh", "L001");
        library.addLibraryMember(librarian,true);

        // Adding some books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Novel", "1925", "ISBN0001");
        BookDetail bookDetail1 = new BookDetail("B001", "R01");
        book1.getBookDetails().add(bookDetail1);
        librarian.addBook(book1, library);

        Book book2 = new Book("The Great", "George Orwell", "Dystopian", "1949", "ISBN0002");
        BookDetail bookDetail2 = new BookDetail("B002", "R02");
        book2.getBookDetails().add(bookDetail2);
        librarian.addBook(book2, library);

        // Registering a new member
        Member member = new Member("Rajat", "M001");
        LibraryMember libraryMember = new LibraryMember(member,true);
        library.addLibraryMember(libraryMember);

        // Searching books by title
        System.out.println("Searching books by title '1984':");
        List<Book> foundBooks = library.searchByTitle("1984");
        for (Book book : foundBooks) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

//        // Member checks out a book
        if (libraryMember.checkoutBook(bookDetail2) && libraryMember.membershipStatus) {
            System.out.println(libraryMember.getName() + " checked out " + book2.getTitle());
        } else {
            System.out.println(libraryMember.getName() + " could not check out " + book2.getTitle());
        }

//
//        // Returning the book
        if (libraryMember.returnBook(bookDetail2)) {
            System.out.println(libraryMember.getName() + " returned " + book2.getTitle());
        } else {
            System.out.println(libraryMember.getName() + " could not return " + book2.getTitle());
        }
    }
}
