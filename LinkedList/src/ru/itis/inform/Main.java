package ru.itis.inform;

public class Main {

    public static void main(String[] args) {
LinkedList<Integer> V = new LinkedList();
        V.add(8);
        V.add(1);
        V.add(7);

        Iterator<Integer> iterator = V.iterator();

     iterator.next();
        iterator.insert(9);
        iterator.back();


       System.out.print(iterator.pickNext());


    }
      //  V.remove(8);
       // V.show();
    }

