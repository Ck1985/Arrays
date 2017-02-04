package arrays;

/**
 * Created by anonymous.vn1985 on 2/4/2017.
 */
import java.util.*;
import net.mindview.util.*;

public class StringSorting {
    public static void main(String[] args){
        String[] stringArray = Generated.array(new String[10], new RandomGenerator.String(5));
        System.out.println("Before sorting String: \n" + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("After sorting String: \n" + Arrays.toString(stringArray));
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("After sorting reverse: \n" + Arrays.toString(stringArray));
        Arrays.sort(stringArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(stringArray));
    }
}
