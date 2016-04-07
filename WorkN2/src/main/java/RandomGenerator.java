import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;


public class RandomGenerator {
    Random a = new Random();
    int n = a.nextInt(7900)+100;
    ArrayList<String> randomArray;
    int countOfArrays = a.nextInt(10)+20;
    ReaderWriter rw = new ReaderWriter();
    private int [] sizes = new int [countOfArrays];
    public RandomGenerator() throws FileNotFoundException{
        for (int z = 0; z < countOfArrays; z++) {

            randomArray = new ArrayList<String>(n);
            String fileName = "s"+z ;

            for (int i = 0; i < n; i++) {
                String word = new String();
                int t = a.nextInt(10);
                for (int j = 0; j < t; j++) {
                    word = word + "1";
                }
                randomArray.add(i,word);
                word = "";
            }
            sizes[z] = n;
            rw.write(randomArray, fileName);
           n+=70;
        }
  }

    public int[] getSizes(){
        return sizes;
    }
    public void show(){
        for (int i=0; i< randomArray.size();i++){
            System.out.println(randomArray.get(i));
        }
    }
    public int size(){
        return randomArray.size();
    }
    public String get(int i){
        return randomArray.get(i);
    }
    public void set(int index, String a){
        randomArray.set(index, a);
    }
}
