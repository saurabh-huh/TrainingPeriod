package oops.hotelManagement;

public interface Database<T> {
    void add(T item);
    void delete(String identifier);
    T get(String identifier);
}
