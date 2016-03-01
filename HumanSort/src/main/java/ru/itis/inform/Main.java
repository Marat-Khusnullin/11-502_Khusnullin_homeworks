package ru.itis.inform;

import java.io.FileNotFoundException;


public class Main  {
    public static void main(String[] args) throws FileNotFoundException {
    HumansSorter s = new HumansSorter();
        s.initArrayByLinked();
    HumansReaderWriter l = new HumansReaderWriter();
        LinkedList<Human> m = l.readHumans();

        m =s.sort(m);
       // m.show();
        l.writeHumans(m);


    }
}