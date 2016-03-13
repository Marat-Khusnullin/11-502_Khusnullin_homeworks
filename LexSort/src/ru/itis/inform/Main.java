package ru.itis.inform;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws FileNotFoundException {

    HumansReaderWriter l = new HumansReaderWriter();
        LinkedList<Human> m = l.readHumans();
        HumansSorter v = new HumansSorter();

        m.show();
        m =v.sort(m);
        l.writeHumans(m);


    }




}
