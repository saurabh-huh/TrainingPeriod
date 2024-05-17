package oops.libraryManage;

import java.util.Date;
import java.util.List;

public class Book {
    String bookId;
    String author;
    String title;
    String category;
    String publication;
    List<BookDetail> BookItems;

    public Book(String bookId, String author, String title, String category, String publication, List<BookDetail> bookItems) {
        this.bookId = bookId;
        this.author = author;
        this.title = title;
        this.category = category;
        this.publication = publication;
        BookItems = bookItems;
    }
}
