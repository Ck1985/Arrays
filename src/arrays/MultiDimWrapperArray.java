package arrays;

/**
 * Created by anonymous on 1/24/2017.
 */
import java.util.*;

public class MultiDimWrapperArray {
    public static void main(String[] args){
        Integer[][] a1 = {
                {1,2,3},
                {4,5,6}
        };
        Double[][][] a2 = {
                {
                        {1.0, 2.0, 3.0},
                        {1.0, 2.0, 3.0, 4.0}
                },
                {
                        {1.1, 1.2, 1.3, 1.4, 1.5},
                        {1.1, 1.2, 1.3},
                        {1.1, 1.2, 1.3, 1.4},
                },
                {
                        {1.1, 1.2, 1.3, 1.4, 1.5, 1.6}
                }
        };
        String[][] a3 = {
                {"one", "two", "three"},
                {"one", "two", "three", "four"},
                {"one", "two", "three", "four", "five"},
                {"one", "two", "three", "four", "five", "six"}
        };
        System.out.println("a1: " + Arrays.deepToString(a1));
        System.out.println("a2: " + Arrays.deepToString(a2));
        System.out.println("a3: " + Arrays.deepToString(a3));
    }
}
