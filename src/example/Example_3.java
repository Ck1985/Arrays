package example;

/**
 * Created by anonymous on 1/24/2017.
 */
import java.util.*;

public class Example_3 {
    public static double[][] construcArray(int size1, int size2, double begin, double end){
        if(end < begin){
            System.out.println("Error! value of end must be greater than begin");
            return null;
        }
        if((size1 < 1) || (size2 < 1)){
            System.out.println("size1 and size2 must be greater than 1  or equal 1");
            return null;
        }
        double[][] resultArray = new double[size1][size2];
        for(int j = 0; j < size2; j++){
            resultArray[0][j] = begin + ((double)j * (end - begin))/(size2 - 1);
        }
        if(size1 == 1){
            return resultArray;
        }else{
            for(int i = 1; i < size1; i++){
                resultArray[i] = new double[size2];
                for(int j = 0; j < size2; j++){
                    resultArray[i][j] = begin + ((double)j/(size2 - 1))*(((double)j + (double)i))/(size2 - 1 + (double)i)*(end - begin);
                }
            }
            return resultArray;
        }
    }
    public static void showArray(double[][] array){
        System.out.println(Arrays.deepToString(array));
    }
    public static void main(String[] args){
        showArray(construcArray(1, 2, 4.5, 8.9));
        showArray(construcArray(3, 4, 3.4, 9.4));
        showArray(construcArray(1,2,6.5, 2.1));
        showArray(construcArray(0, 2, 3, 6));
    }
}
