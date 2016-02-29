package ru.itis.inform;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class HumansReaderWriter {



        public LinkedList<Human> readHumans()
                throws FileNotFoundException {

            Scanner sc = new Scanner(new File("C:\\Users\\Марат\\Desktop\\11-502_Khusnullin_Homeworks\\HumanSort\\src\\ru\\itis\\inform\\input\\Humans.txt"));
            LinkedList<Human> humanLinkedList = new LinkedList<>();

            Human human;

            while (sc.hasNext()) {

                int age = sc.nextInt();
                String name = sc.nextLine();

                human = new Human(age, name);

                humanLinkedList.addToEnd(human);
            }
            sc.close();
            return humanLinkedList;
        }

        public void writeHumans(String fileName, LinkedList<Human> humanLinkedList) throws FileNotFoundException {
            PrintWriter pw = new PrintWriter(new File("C:\\Users\\Марат\\Desktop\\11-502_Khusnullin_Homeworks\\HumanSort\\src\\ru\\itis\\inform\\output\\"+fileName+".txt"));

            Iterator<Human> iterator = humanLinkedList.iterator();

            while (iterator.hasNext()) {
                pw.println(iterator.pickNext().toString()+" ");
                iterator.next();
            }



            pw.close();

        }
}
