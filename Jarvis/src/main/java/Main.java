import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Марат on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point k [] = new Point [n];
        for(int i = 0; i< n; i++ ){
            int x = sc.nextInt();
            int y = sc.nextInt();
            k[i] = new Point(x, y);
        }
        Shell v = new Shell();
        v.doJarvis(k);

    }
}
