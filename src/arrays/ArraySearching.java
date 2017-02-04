package arrays;

/**
 * Created by anonymous.vn1985 on 2/4/2017.
 */
import java.util.*;
import arrays.*;
import net.mindview.util.*;

public class ArraySearching {
    public static void main(String[] args){
        Generator<Integer> gc = new RandomGenerator.Integer(1000);
        Integer[] integerArray = Generated.array(new Integer[25],gc);
        int[] intArray = ConvertTo.primitive(integerArray);
        int[] intArrayUnsorted = ConvertTo.primitive(Generated.array(new Integer[25], gc));
        Arrays.sort(intArray);
        System.out.println("Array sorted: " + Arrays.toString(intArray));

        while(true){
            int r = gc.next();
            int location = Arrays.binarySearch(intArray,r);
            if(location >= 0){
                System.out.println("Element " + r + " has at location: " + location);
                break;
            }else{
                System.out.println("location = " + location);
            }
        }
    }
}
