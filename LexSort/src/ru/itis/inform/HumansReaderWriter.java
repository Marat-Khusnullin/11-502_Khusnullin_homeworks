package ru.itis.inform;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Марат on 01.03.2016.
 */
public class HumansReaderWriter {
    public LinkedList<Human> readHumans()
            throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Users\\Марат\\Desktop\\11-502_Khusnullun_Homeworks\\LexSort\\src\\ru\\itis\\inform\\Humans.txt"));
        LinkedList<Human> humanLinkedList = new LinkedList<>();

        while (sc.hasNext()) {

            String string = sc.nextLine();
            int sizeOfNames = string.length();
            String name;
            name ="";
            char [] nameByArray = string.toCharArray();

            for (int i=0;i< sizeOfNames;i++) {
                if (nameByArray[i] != ' ')  {
                    name += nameByArray[i];

                } else {
                    humanLinkedList.addToEnd(new Human(name));
                    name ="";
                }

                if (i == (sizeOfNames-1)) {
                    humanLinkedList.addToEnd(new Human(name));
                }
            }
        }


        sc.close();
        return humanLinkedList;
    }

    public void writeHumans(LinkedList<Human> humanLinkedList) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File("C:\\Users\\Марат\\Desktop\\11-502_Khusnullun_Homeworks\\LexSort\\src\\ru\\itis\\inform\\SortedHumans.txt"));

        Iterator<Human> iterator = humanLinkedList.iterator();

        while (iterator.hasNext()) {
            if (iterator.pickNext() != null)
            writer.println(iterator.pickNext().toString() + " ");
            iterator.next();
        }
    }

}
