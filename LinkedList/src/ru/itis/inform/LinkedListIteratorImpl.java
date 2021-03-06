package ru.itis.inform;

public class LinkedListIteratorImpl<T> implements Iterator<T> {
    //Почему так задается?
     Node<T> current;

    public LinkedListIteratorImpl (Node<T> first) {
        this.current = first;
    }




    public boolean hasNext() {

        return current !=null;
    }

    public T next() {
        T value = current.getValue();
        this.current = current.getNext();
        return value;

    }

    public void back() {
        LinkedList t;
        t = new LinkedList();
        current = t.getFirst();

       /* current.setPrevious(null);
        current.setNext(t.getFirst());*/
    }

    public T pickNext() {
        T value = (T) current.getValue();
        return value;
    }

    public T pickPrevious() {
         T value = (T) current.getPrevious();
        return value;

    }
   public boolean hasPrev() {
       return current.getPrevious() !=null;
   }



  public T previous() {
        if (hasPrev()) {
            current = current.getPrevious();
            return current.getValue();
       } else
            throw new IllegalArgumentException();
    }

    public void insert (T element) {
           Node <T> newnode = new Node<>(element);

        newnode.setPrevious(current.getPrevious());
        current.getPrevious().setNext(newnode);

        newnode.setNext(current);
        current.setPrevious(newnode);

    }

}
