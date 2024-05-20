package oops.LibraryManagement;

import java.util.ArrayList;
import java.util.List;

class Library {
    private CatalogManagement catalogManagement;
    private List<LibraryMember> libraryMembers;
    public Library() {
        this.catalogManagement = new CatalogManagement();
        this.libraryMembers = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalogManagement.addBook(book);
    }

    public void removeBook(Book book) {
        catalogManagement.removeBook(book);
    }

    public List<Book> searchByTitle(String title) {
        return catalogManagement.searchByTitle(title);
    }

    public List<Book> searchByAuthor(String author) {
        return catalogManagement.searchByAuthor(author);
    }

    public List<Book> searchBySubject(String subject) {
        return catalogManagement.searchBySubject(subject);
    }

    public void addLibraryMember(Member member,boolean membershipStatus) {
        LibraryMember libraryMember = new LibraryMember(member,membershipStatus);
        libraryMembers.add(libraryMember);
    }
    public void addLibraryMember(LibraryMember libraryMember){
        libraryMembers.add(libraryMember);
    }

    public void removeLibraryMember(Member member,boolean membershipStatus) {
        LibraryMember libraryMember = new LibraryMember(member,membershipStatus);
        libraryMembers.remove(libraryMember);
    }
    public void removeLibraryMember(LibraryMember libraryMember){
        libraryMembers.remove(libraryMember);
    }
}