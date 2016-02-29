package ru.itis.inform;


public class LinkedList<T> implements ListInter<T> {

    private int count;
    private Node<T> first;
    private Node<T> last;

    public LinkedList() {
        this.first = null;
    }

    public Node<T> getFirst() {
        return this.first;
    }

    public void add(T element) {
        Node<T> newNode = new Node<T>(element);

        if (first == null) {
            this.first = newNode;
        } else {
            newNode.setNext(this.first);
            this.first.setPrevious(newNode);
            this.first = newNode;
        }
        this.count++;
    }


        public void addToEnd (T element) {
            Node<T> newNode = new Node<T>(element);
            this.last = null;

            if (first == null) {
                this.first = newNode;
                first.setNext(last);
            } else {
                Node z = first;
                while(z.getNext()!=null) {
                    z = z.getNext();
                }
                z.setNext(newNode);
                newNode.setPrevious(z);
            }
            this.count++;
        }
    public void remove(T element) {
        Node rm = first;
        for (int i = 0; i < count - 1; i++) {
            if ((i == 0) && (rm.getValue() == element)) {
                first = rm.getNext();
                count--;
                break;
            } else if (rm.getNext().getValue() == element) {
                rm.setNext(rm.getNext().getNext());
                count--;
            }
            rm = rm.getNext();
        }
    }

    public void show() {
        Node<T> r = first;
        while (r != null) {
            System.out.print(r.getValue() + " ");
            r = r.getNext();
        }
    }

    public Iterator<T> iterator() {
        return new LinkedListIteratorImpl<T>(this.first);
    }

    }

