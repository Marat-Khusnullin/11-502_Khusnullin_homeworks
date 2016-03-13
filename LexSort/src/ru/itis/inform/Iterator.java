package ru.itis.inform;


public interface Iterator<T> {
  //  boolean hasPrev();
    boolean hasNext();
    void next();
    T previous();
    T pickNext();
    T pickPrevious();
   void back(LinkedList<T> linkedList);
    void insert(T element);
}
