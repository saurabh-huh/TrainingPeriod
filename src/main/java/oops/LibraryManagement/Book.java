package oops.LibraryManagement;

import java.util.*;

class Book {
    private String title;
    private String author;
    private String subject;
    private String publicationDate;
    private String bookId;
    private List<BookItem> bookItems;

    public Book(String title, String author, String subject, String publicationDate, String bookId) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.publicationDate = publicationDate;
        this.bookId = bookId;
        this.bookItems = new ArrayList<>();
    }

    // Getters and other necessary methods...
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getSubject() { return subject; }
    public String getPublicationDate() { return publicationDate; }
    public String getBookId() { return bookId; }
    public List<BookItem> getBookItems() { return bookItems; }
}