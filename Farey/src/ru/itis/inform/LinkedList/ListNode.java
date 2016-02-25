package ru.itis.inform.LinkedList;

/**
 * Created by Марат on 14.02.2016.
 */
public interface ListNode<T> {
    void add(T element);

    void remove(T element);

    void show();

    void addToEnd(T element);
}
