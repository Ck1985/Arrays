package example;

/**
 * Created by anonymous on 1/26/2017.
 */
import java.util.*;

public class Example_4 {
    public static double[][][] createArray(int size1, int size2, int size3, double start, double end){
        if((start > end) || (start < 0) || (end < 0)){
            System.out.println("Value of start or end is incorrect");
            return null;
        }
        if((size1 < 1) || (size2 < 1) || (size3 < 1)){
            System.out.println("size1, size2 or size3 must be >= 1");
            return null;
        }
        double[][][] resultArray = new double[size1][size2][size3];
        for(int i = 0; i < size1; i++){
            resultArray[i] = Example_3.construcArray(size2, size3, start, end);
        }
        return resultArray;
    }
    public static void showarray(double[][][] array){
        System.out.println(Arrays.deepToString(array));
    }
    public static void main(String[] args){
        showarray(createArray(3,4,5,7.5,9.8));
        showarray(createArray(2,1,3,2.1,7.6));
    }
}
