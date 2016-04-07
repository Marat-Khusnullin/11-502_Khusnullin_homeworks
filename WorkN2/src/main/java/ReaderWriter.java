import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ReaderWriter {
    public void write( ArrayList<String> words,String nameOfFile) throws FileNotFoundException {

        PrintWriter writer = new PrintWriter(new File("C:\\Users\\Марат\\Desktop\\11-502_Khusnullun_Homeworks\\WorkN2\\Data\\"+ nameOfFile+".txt"));
        for (int i = 0; i <words.size() ; i++) {
              writer.print(words.get(i)+" ");
        }
        writer.close();

    }
    public ArrayList<String> read(String name)
            throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Users\\Марат\\Desktop\\11-502_Khusnullun_Homeworks\\WorkN2\\Data\\"+name+ ".txt"));
        ArrayList<String> suka = new ArrayList<String>();

        while (sc.hasNext()) {


            String word = sc.next();
            suka.add(word);
        }
        sc.close();
        return suka;
    }



}
