package ru.itis.inform;

import ru.itis.inform.Human;


import java.io.FileNotFoundException;

public class Main  {
    public static void main(String[] args) throws FileNotFoundException {

    HumansReaderWriter l = new HumansReaderWriter();
        LinkedList<Human> m = l.readHumans();
        HumansSorter v = new HumansSorter();
        m =v.sort(m);
        l.writeHumans(m);


    }




}
