package arrays;

/**
 * Created by anonymous on 1/29/2017.
 */
import java.util.*;

public class GeneretedTest {
    public static void main(String[] args){
        Integer[] a = {9,8,7,6,5};
        System.out.println(Arrays.toString(a));
        a = Generated.array(a, new CountingGenerators.Integer());
        System.out.println(Arrays.toString(a));
        Integer[] b = Generated.array(Integer.class, new CountingGenerators.Integer(), 15);
        System.out.println(Arrays.toString(b));
    }
}
