package arrays;

/**
 * Created by anonymous.vn1985 on 2/4/2017.
 */
import java.util.*;
import arrays.*;

public class AlphabeticSearch {
    public static void main(String[] args){
        String[] strings = Generated.array(new String[30],new RandomGenerators.String(5));
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER);
        System.out.println("String array after sorting: \n" + Arrays.toString(strings));
        int index = Arrays.binarySearch(strings,strings[8],String.CASE_INSENSITIVE_ORDER);
        System.out.println("string[8]: " + strings[8] + " has index: " + index);
    }
}
