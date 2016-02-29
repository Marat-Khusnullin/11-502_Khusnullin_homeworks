package ru.itis.inform;


public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;
        private int count;

        public LinkedList() {
            this.first = null;
            this.count = 0;
        }


        public void add(T element) {
            Node newNode = new Node<T>(element);
            newNode.setPrevious(null);
            if (first == null) {
                this.first = newNode;
            } else {
                newNode.setNext(this.first);
                first.setPrevious(newNode);
                first = newNode;
            }
           this.count++;
        }
    // Добавление в конец связного списка. Это вроде и не надо, но пусть будет.
        public void toend (T element) {
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

        public Node<T> getFirst () {
            return first;
        }
        public void show() {
            Node r = first;
            while(r!=null) {
                System.out.print(r.getValue()+" ");
                r = r.getNext();
            }
        }

         public void remove(T element) {
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
    public Iterator<T> iterator() {
        return new LinkedListIteratorImpl<T>(this.first);
    }

    }

