package ru.itis.inform;


public interface Iterator<T> {
  //  boolean hasPrev();
    boolean hasNext();
  void back(LinkedList<T> linkedList);
    T next();
    T previous();
    T pickNext();
    T pickPrevious();
    void insert(T element);
}
