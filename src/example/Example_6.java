package example;

/**
 * Created by anonymous on 1/26/2017.
 */
import java.util.*;
import arrays.*;

public class Example_6 {
    public static BerylliumSphere[][] createArray(int size1, int size2){
        BerylliumSphere[][] resultArray = new BerylliumSphere[size1][size2];
        for(int i = 0; i < size1; i++){
            resultArray[i] = new BerylliumSphere[size2];
            for(int j = 0; j < size2; j++){
                resultArray[i][j] = new BerylliumSphere();
            }
        }
        return resultArray;
    }
    public static <T> void showArray(T[] array){
        System.out.println(Arrays.deepToString(array));
    }
    public static void main(String[] args){
        showArray(createArray(2,3));
        showArray(createArray(3,4));
    }
}
