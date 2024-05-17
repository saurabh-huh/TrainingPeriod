package oops.LibraryManagement;

class Librarian extends Member {
    public Librarian(String name, String memberId) {
        super(name, memberId);
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
    }

    public void removeBook(Book book, Library library) {
        library.removeBook(book);
    }
}