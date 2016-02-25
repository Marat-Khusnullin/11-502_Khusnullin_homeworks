package ru.itis.inform.LinkedList;

/**
 * Created by Марат on 18.02.2016.
 */
public interface Iterator<T> {
    boolean hasNext();

    T next();

    T previous();

    T pickNext();

    T pickPrevious();

    void insert(T element);

    int getCount();
}
