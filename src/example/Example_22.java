package example;

/**
 * Created by anonymous.vn1985 on 2/4/2017.
 */
import java.util.*;
import arrays.*;

public class Example_22 {
    public static void main(String[] args){
        int[] intArray = ConvertTo.primitive(Generated.array(new Integer[50],new RandomGenerators.Integer(1000)));
        int[] intArray2 = ConvertTo.primitive(Generated.array(new Integer[50],new RandomGenerators.Integer(1000)));
        Arrays.sort(intArray);
        int index1 = Arrays.binarySearch(intArray,intArray[10]);
        int index2 = Arrays.binarySearch(intArray2, intArray2[10]);
        System.out.println(index1);
        System.out.println(index2);
    }
}
