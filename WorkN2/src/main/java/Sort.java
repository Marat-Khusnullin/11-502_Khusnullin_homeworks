import java.util.ArrayList;

/**
 * Created by Марат on 04.04.2016.
 */
public class Sort {
    public void sortByLength(ArrayList<String> list){
        int j=0;
        while (j!=list.size()){
            int maxSize=list.get(j).length();
            int maxIndex=j;
            for (int i=j;i<list.size();i++){
                if (list.get(maxIndex).length()<list.get(i).length()){
                    maxIndex=i;
                    maxSize=list.get(i).length();
                }
            }
            String jar=list.get(j);
            list.set(j,list.get(maxIndex));
            list.set(maxIndex,jar);
            j++;
        }
    }
}
