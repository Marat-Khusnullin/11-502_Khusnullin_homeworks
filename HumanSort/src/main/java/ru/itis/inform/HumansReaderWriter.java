package ru.itis.inform;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class HumansReaderWriter {



        public LinkedList<Human> readHumans()
                throws FileNotFoundException {

            Scanner sc = new Scanner(new File("C:\\Users\\Марат\\Desktop\\11-502_Khusnullun_Homeworks\\HumanSort\\src\\main\\java\\ru\\itis\\inform\\Humans.txt"));
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

        public void writeHumans( LinkedList<Human> humanLinkedList) throws FileNotFoundException {
            PrintWriter writer = new PrintWriter(new File("C:\\Users\\Марат\\Desktop\\11-502_Khusnullun_Homeworks\\HumanSort\\src\\main\\java\\ru\\itis\\inform\\SortedHumans.txt"));

            Iterator<Human> iterator = humanLinkedList.iterator();

            while (iterator.hasNext()) {
                writer.println(iterator.pickNext().toString()+" ");
                iterator.next();
            }



            writer.close();

        }
}
