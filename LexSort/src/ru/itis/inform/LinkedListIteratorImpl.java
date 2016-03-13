package ru.itis.inform;

public class LinkedListIteratorImpl<T> implements Iterator<T> {
     private Node<T> current;

    public LinkedListIteratorImpl (Node<T> first) {

        this.current = first;
    }

    public void back (LinkedList<T> linkedList) {

        this.current = linkedList.getFirst();
    }

    public boolean hasNext() {

        return current !=null;
    }


    public boolean hasPrev() {

        return current.getPrevious() !=null;
    }

    public void  next() {
        T value = current.getValue();
        this.current = current.getNext();
      ///  return value;

    }

    public T previous() {
        if (hasPrev()) {
            current = current.getPrevious();
            return current.getValue();
        } else
            throw new IllegalArgumentException();
    }

    public T pickNext() {
        T value = (T) current.getValue();
        return value;
    }

    public T pickPrevious() {
        T value = (T) current.getPrevious();
        return value;

    }


    public void insert (T element) {
           Node <T> newnode = new Node<>(element);

        newnode.setPrevious(current.getPrevious());
        current.getPrevious().setNext(newnode);

        newnode.setNext(current);
        current.setPrevious(newnode);

    }

}
