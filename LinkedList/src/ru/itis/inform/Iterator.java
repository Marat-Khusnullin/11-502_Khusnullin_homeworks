package ru.itis.inform;


public interface Iterator<T> {
    boolean hasNext();
    T next();
    T previous();
    void insert(T element);
}
