package oops.LibraryManagement;

import java.util.ArrayList;
import java.util.List;

class Library {
    private Catalog catalog;
    private List<Member> members;

    public Library() {
        this.catalog = new Catalog();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.addBook(book);
    }

    public void removeBook(Book book) {
        catalog.removeBook(book);
    }

    public List<Book> searchByTitle(String title) {
        return catalog.searchByTitle(title);
    }

    public List<Book> searchByAuthor(String author) {
        return catalog.searchByAuthor(author);
    }

    public List<Book> searchBySubject(String subject) {
        return catalog.searchBySubject(subject);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void removeMember(Member member) {
        members.remove(member);
    }
}