package ru.itis.inform.LinkedList;

/**
 * Created by Марат on 15.02.2016.
 */
public class ListNodeImpl<T> implements ListNode<T> {
    private Node<T> first;
    private Node<T> last;

    private int count;

    public Node<T> getFirst() {
        return this.first;
    }

    public ListNodeImpl() {
        this.first = null;
        this.count = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.setPrevious(null);
        if (first == null) {
            this.first = newNode;
        } else {
            newNode.setNext(first);
            first.setPrevious(newNode);
            this.first = newNode;
        }
        this.count++;
    }
    public void addToEnd(T element) {
        Node<T> newNode = new Node<>(element);

        this.last = null;

        if (first == null) {
            this.first = newNode;

        } else {
            Node<T> f = first;
            while (f.getNext() != null) {
                f = f.getNext();
            }
            f.setNext(newNode);
            newNode.setPrevious(f);

        }
        this.count++;
    }

    public void remove(T element) {
        Node<T> r = first;
        for (int i = 0; i < this.count - 1; i++) {
            if (r.getNext().getValue() == element && r.getNext().getValue() == element) {
                r.setNext(r.getNext().getNext());
                break;
            } else if (i == 0 && r.getValue() == element && r.getValue() == element) {
                r.setNext(r.getNext());
            }
            r = r.getNext();
        }
    }

    public void show() {
        Node<T> f = first;
        while (f != null) {
            if (f.getNext() != null)
                System.out.print(f.getValue() + " ");
            else
                System.out.print(f.getValue() + ".");
            f = f.getNext();
        }
    }

    public IteratorImpl<T> iterator() {
        return new IteratorImpl<>(this.first);
    }


    class IteratorImpl<T> implements Iterator<T> {
        private Node<T> current;

        int count = 2;

        public IteratorImpl(Node<T> first) {
            this.current = first;
        }

        public int getCount() {
            return count;
        }

        public boolean hasNext() {
            return current != null;
        }

        public T next() {
            T value = current.getValue();
            Node<T> f = this.current;
            this.current = f.getNext();
            return value;
        }


        public T previous() {
            if (current.getPrevious() != null) {
                T value = current.getPrevious().getValue();
                Node<T> f = this.current;
                this.current = f.getPrevious();
                return value;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }


        public T pickNext() {
            T value = current.getValue();
            return value;
        }

        public T pickPrevious() {
            T value = current.getPrevious().getValue();
            return value;
        }

        public void insert(T element) {
            Node<T> newNode = new Node<>(element);
            Node<T> z = this.current;

            this.count++;

            newNode.setPrevious(z.getPrevious());
            z.getPrevious().setNext(newNode);
            newNode.setNext(z);
            z.setPrevious(newNode);

            this.current = z.getPrevious();
        }
    }
}