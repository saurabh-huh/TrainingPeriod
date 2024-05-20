package oops.LibraryManagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CatalogManagement {
    private Map<String, List<Book>> booksByTitle;
    private Map<String, List<Book>> booksByAuthor;
    private Map<String, List<Book>> booksBySubject;

    public CatalogManagement() {
        booksByTitle = new HashMap<>();
        booksByAuthor = new HashMap<>();
        booksBySubject = new HashMap<>();
    }



    public void addBook(Book book) {
        String title = book.getTitle();
        if (!booksByTitle.containsKey(title)) {
            booksByTitle.put(title, new ArrayList<>());
        }
        booksByTitle.get(title).add(book);

        String author = book.getAuthor();
        if (!booksByAuthor.containsKey(author)) {
            booksByAuthor.put(author, new ArrayList<>());
        }
        booksByAuthor.get(author).add(book);

        String subject = book.getSubject();
        if (!booksBySubject.containsKey(subject)) {
            booksBySubject.put(subject, new ArrayList<>());
        }
        booksBySubject.get(subject).add(book);
    }

    public void removeBook(Book book) {
        String title = book.getTitle();
        if (booksByTitle.containsKey(title)) {
            booksByTitle.get(title).remove(book);
        }

        String author = book.getAuthor();
        if (booksByAuthor.containsKey(author)) {
            booksByAuthor.get(author).remove(book);
        }

        String subject = book.getSubject();
        if (booksBySubject.containsKey(subject)) {
            booksBySubject.get(subject).remove(book);
        }
    }

    public List<Book> searchByTitle(String title) {
        return booksByTitle.getOrDefault(title, new ArrayList<>());
    }

    public List<Book> searchByAuthor(String author) {
        return booksByAuthor.getOrDefault(author, new ArrayList<>());
    }

    public List<Book> searchBySubject(String subject) {
        return booksBySubject.getOrDefault(subject, new ArrayList<>());
    }
}