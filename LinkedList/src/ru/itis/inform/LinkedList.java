package ru.itis.inform;

/**
 * Created by Марат on 15.02.2016.
 */
public class LinkedList {

    private Node first;

        private int count;

        public LinkedList() {
            this.first = null;
            this.count = 0;
        }

        public void add(int element) {
            Node newNode = new Node(element);

            if (first == null) {
                this.first = newNode;
            } else {
                newNode.setNext(this.first);
                first = newNode;
            }
            count++;
        }
        public void show() {
            Node r = first;
            while(r!=null) {
                System.out.print(r.getValue()+" ");
                r = r.getNext();
            }
        }

    public void remove(int element) {
        Node rm = first;
        for(int i = 0; i < count-1; i++) {
            if ((i==0) && (rm.getValue() == element)) {
                first = rm.getNext();
                count--;
                break;
            }
            else
            if(rm.getNext().getValue() == element) {
                rm.setNext(rm.getNext().getNext());
                count--;
            }
            rm = rm.getNext();
        }
    }
    }

