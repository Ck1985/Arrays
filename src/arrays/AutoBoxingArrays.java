package arrays;

/**
 * Created by anonymous on 1/24/2017.
 */
import java.util.*;

public class AutoBoxingArrays {
    public static void main(String[] args){
        Integer[][] raggedArray = {
                {1,2,3,4,5},
                {1,2,3},
                {1,2,3,4,5,6,7},
                {1,2,3,4},
                {1,2}
        };
        System.out.println(Arrays.deepToString(raggedArray));
    }
}
