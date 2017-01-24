package arrays;

/**
 * Created by anonymous on 1/24/2017.
 */
import java.util.*;

public class AssemblingMultiDimensionArrays {
    public static void main(String[] args){
        Integer[][] raggedArray = new Integer[3][];
        for(int i = 0; i < raggedArray.length; i++){
            raggedArray[i] = new Integer[3];
            for(int j = 0; j < raggedArray[i].length; j++){
                raggedArray[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(raggedArray));
    }
}
