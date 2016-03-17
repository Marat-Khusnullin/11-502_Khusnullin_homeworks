package ru.itis.inform;

import java.io.FileNotFoundException;

/**
 * Created by Марат on 14.03.2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        LinkedList s = new LinkedList();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        a.addToEnd(7);
        a.addToEnd(12);
        a.addToEnd(12);
        a.addToEnd(8);
        a.addToEnd(7);
        a.addToEnd(69);
        a.addToEnd(70);
        a.addToEnd(70);
        a = a.mergeSort(a);
        a.show();




        b.addToEnd(2);
        b.addToEnd(10);
        b.addToEnd(15);
     //   s= s.doMerge(a,b);
      //  s.show();


    }

}
