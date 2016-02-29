package ru.itis.inform;




public class ArrayList <T>  {
    private int MAX_SIZE = 100;
    private int n;
    private int i;
    private int count;
    private  Object []  elements;

    public ArrayList() {
        elements = new Object[MAX_SIZE];
        this.count = MAX_SIZE;
    }

    public void set(int index, T element) {
        this.elements[index] = element;
    }
    public T get(int index) {
        if (index >=0 && index < this.count) {
            return (T)this.elements[index];
        } else {
            throw new IllegalArgumentException();
        }
    }

}
