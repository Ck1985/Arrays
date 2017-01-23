package arrays;

/**
 * Created by anonymous.vn1985 on 1/23/2017.
 */
import java.util.*;

public class ThreeDWithNew {
    public static void main(String[] args){
        int[][][] array = new int[3][2][6];
        System.out.println(Arrays.deepToString(array));
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
    }
}
