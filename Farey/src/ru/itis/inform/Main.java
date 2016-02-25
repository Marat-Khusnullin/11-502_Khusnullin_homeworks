package ru.itis.inform;

import ru.itis.inform.Version1ByArray.*;
import ru.itis.inform.LinkedList.*;

public class Main {

    public static void main(String[] args) {
        FareyGenerate A = new FareyGenerate();
        A.generate(7);
        A.print();
        System.out.println();
        FareyLinkedListImpl L = new FareyLinkedListImpl();
        L.initialize(4);
        L.generate();
        L.print();

    }

}
