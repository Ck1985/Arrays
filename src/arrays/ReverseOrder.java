package arrays;

/**
 * Created by anonymous on 2/3/2017.
 */
import java.util.*;
import net.mindview.util.*;

public class ReverseOrder {
    public static void main(String[] args){
        CompType[] array = Generated.array(new CompType[10], CompType.generator());
        System.out.println("Before sorting array: \n" + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("After reverse sprting array: \n" + Arrays.toString(array));
    }
}
