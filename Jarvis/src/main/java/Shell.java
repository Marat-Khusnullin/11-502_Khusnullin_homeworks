import java.util.ArrayList;

/**
 * Created by Марат on 18.03.2016.
 */
public class Shell {
    public void doJarvis(Point l []) {
        int indexOfFirst=0;
        int indexOfSecond=0;
        int minX =l[0].getX();
        int minY =l[0].getY();
        double mmCos = 1;
        for (int i = 0; i<l.length; i++){
           if((l[i].getY()< minY)||((l[i].getY()== minY)&&(l[i].getX()<minX))) {
               indexOfFirst = i;
               minX = l[i].getX();
               minY = l[i].getY();
           }
        }
        System.out.println("("+ minX + ";" + minY + ")");
        double vector1x =-1;
        double vector1y =minY;
        double vector2x =0;
        double vector2y =0;


    for (int i = 0; i< l.length; i++) {
        vector2x = l[i].getX()-minX;
        vector2y = l[i].getY()-minY;
        //System.out.println(searchCos(vector1x, vector1y,vector2x, vector2y));
        if (searchCos(vector1x, vector1y, vector2x, vector2y)< mmCos) {
            //System.out.println("cos: "+ searchCos(vector1x,vector1y,vector2x,vector2y));
            indexOfSecond = i;
           // System.out.println("index:" + indexOfSecond);
            mmCos = searchCos(vector1x, vector1y, vector2x, vector2y);
        }
    }
        System.out.println("("+ l[indexOfSecond].getX()+ ";"+ l[indexOfSecond].getY() + ")");
        int k = 0;
        mmCos = 1;
        minX=l[indexOfFirst].getX();
        minY=l[indexOfFirst].getY();
        while(indexOfSecond!= indexOfFirst) {
        //for (int z = 0; z<3; z++) {
            vector1x = minX - l[indexOfSecond].getX();
            vector1y = minY - l[indexOfSecond].getY();
            minX = l[indexOfSecond].getX();
            minY = l[indexOfSecond].getY();
            for (int i = 0; i < l.length; i++) {
                vector2x = l[i].getX() - l[indexOfSecond].getX();
                vector2y = l[i].getY() - l[indexOfSecond].getY();
                //System.out.println("cos :" + searchCos(vector1x, vector1y, vector2x, vector2y));
                if (mmCos > searchCos(vector1x, vector1y, vector2x, vector2y)) {
                    mmCos = searchCos(vector1x, vector1y, vector2x, vector2y);
                    k = i;
                }
            }
            mmCos = 1;
            //System.out.println("cosChoose :" + mmCos);
            //System.out.println("indexofNext" + k);

                indexOfSecond = k;
            if( indexOfSecond!= indexOfFirst){
                System.out.println("(" + l[indexOfSecond].getX() + ";" + l[indexOfSecond].getY() + ")");
            }
            // }
        }
    }



    public double searchCos(double x1, double y1, double x2, double y2 ){
        double  a = (x1*x2+y1*y2)/((Math.sqrt(x1*x1+y1*y1))*(Math.sqrt(x2*x2+y2*y2)));
        return a;
    }
}
