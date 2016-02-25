package ru.itis.inform.LinkedList;

public class FareyLinkedListImpl<T> implements FareyLinkedList<T> {

    private int n;

    private ListNodeImpl<RationalNumber> list;
    private Iterator<RationalNumber> iterator;

    public void initialize(int n) {
        this.list = new ListNodeImpl<RationalNumber>();
        list.addToEnd(new RationalNumber(0, 1));
        list.addToEnd(new RationalNumber(1, 1));
        this.n = n;
        this.iterator = list.iterator();
    }

    public void generate() {
        iterator.next();
        while (iterator.hasNext()) {
            if (iterator.pickPrevious().getB() + iterator.pickNext().getB() <= this.n) {
                int a = iterator.pickPrevious().getA() + iterator.pickNext().getA();

                int b = iterator.pickPrevious().getB() + iterator.pickNext().getB();

                iterator.insert(new RationalNumber(a, b));
            } else {
                iterator.next();
            }
        }
    }

    public void print() {
        Iterator<RationalNumber> newIterator = list.iterator();
        while (newIterator.hasNext()) {
            System.out.print(newIterator.pickNext().getA() + "/");
            System.out.print(newIterator.pickNext().getB() + " ");
            newIterator.next();
        }
        // System.out.println(newIterator.previous().getA());
    }

    public ListNodeImpl<RationalNumber> getLinked() {
        return this.list;
    }

}
