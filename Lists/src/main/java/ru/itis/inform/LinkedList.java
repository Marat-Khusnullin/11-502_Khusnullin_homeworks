package ru.itis.inform;


public class LinkedList<T> implements ListInter<T> {

    private int count;
    private Node<T> first;
    private Node<T> last;
    public int getCount() {
    return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
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

    public static  <T extends Comparable<T>> LinkedList<T> doMerge(LinkedList<T> a, LinkedList<T> b) {
        Iterator<T> iteratorByA = a.iterator();
        Iterator<T> iteratorByB = b.iterator();
        T value1 = iteratorByA.pickNext();
        T value2 = iteratorByB.pickNext();


        LinkedList<T> s = new LinkedList<>();
        while (iteratorByA.hasNext() && iteratorByB.hasNext()) {
            switch (value1.compareTo(value2)) {
                case -1: {
                    s.addToEnd(value1);
                    iteratorByA.next();
                    if(iteratorByA.hasNext()) {
                        value1 = iteratorByA.pickNext();
                    }
                }
                break;
                case 0: {
                   // System.out.println("case 0");
                    s.addToEnd(value1);
                    iteratorByA.next();
                    if(iteratorByA.hasNext()) {
                        value1 = iteratorByA.pickNext();
                    }
                    s.addToEnd(value2);
                    iteratorByB.next();
                    if(iteratorByB.hasNext()) {
                        value2 = iteratorByB.pickNext();
                    }
                }
                break;
                case 1: {
                    s.addToEnd(value2);
                    iteratorByB.next();
                    if(iteratorByB.hasNext()) {
                        value2 = iteratorByB.pickNext();
                    }
                }
                break;

            }
        }


        while (iteratorByA.hasNext()) {
            s.addToEnd(iteratorByA.pickNext());
            iteratorByA.next();
        }

        while (iteratorByB.hasNext()) {

            s.addToEnd(iteratorByB.pickNext());
            iteratorByB.next();

        }
        return s;
        }

    public static <T extends Comparable> LinkedList<T> mergeSort(LinkedList<T> linkedList) {
        ArrayList<LinkedList<T>> arrayList = new ArrayList<LinkedList<T>>();

        for (int i = 0; i <= linkedList.getCount(); i++) {
            arrayList.set(i, new LinkedList<T>());
        }
        int countOfArray =0;
        Iterator<T> iteratorOfList = linkedList.iterator();
        int check = 0;
        while (arrayList.get(0).getCount()!= linkedList.getCount()) {
            for (int i= countOfArray; i>=1; i--) {
                if ((arrayList.get(i).getCount() == arrayList.get(i - 1).getCount())&&(arrayList.get(i).getCount()!= 0)) {
                    arrayList.set(i - 1, doMerge(arrayList.get(i), arrayList.get(i - 1)));
                    arrayList.set(i, new LinkedList<T>());
                    countOfArray -= 1;
                    check =1;
                }
                if (!iteratorOfList.hasNext() && check!=1) {
                    for ( i = countOfArray-1;i>=1;i--) {
                        arrayList.set(i-1, doMerge(arrayList.get(i), arrayList.get(i-1)));
                    }
                }
            }
            if(iteratorOfList.hasNext()) {
                arrayList.get(countOfArray).addToEnd(iteratorOfList.pickNext());
                iteratorOfList.next();
                countOfArray+=1;
            }
            System.out.println("2");
            check=0;
        }
        return arrayList.get(0);
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

    public void append(LinkedList<T> list) {

        if (this.first == null) {
            Node<T> nodeOfList = list.getFirst();

            this.first = nodeOfList;
            Node<T> r = this.first;
            nodeOfList = nodeOfList.getNext();

            while (nodeOfList != null) {
                r.setNext(nodeOfList);
                nodeOfList.setPrevious(r);
                r = r.getNext();
                nodeOfList = nodeOfList.getNext();
            }

        } else {
            Node<T> r  = this.first;

            while (r.getNext() != null)
                r = r.getNext();

            Node<T> t = list.getFirst();

            while (t!=null) {
                r.setNext(t);
                t.setPrevious(r);
                r = r.getNext();
                t = t.getNext();
            }
        }
    }

    public Iterator<T> iterator() {
        return new LinkedListIteratorImpl<T>(this.first);
    }

    }

