package example;

/**
 * Created by anonymous on 2/2/2017.
 */
import java.util.*;

public class Example_20 {
    public static void main(String[] args){
        Integer[] i1 = new Integer[]{1,2,3,4,5};
        Integer[] i2 = new Integer[]{1,2,3,4,5};
        System.out.println("equals: i1, i2" + Arrays.equals(i1,i2));
        System.out.println("deepEquals: i1, i2" + Arrays.deepEquals(i1,i2));
        String[][][] s1 = new String[][][]{
                {
                        {"one","two","three"},
                        {"four","five"}
                },
                {
                        {"six","seven"},
                        {"eight"}
                },
                {
                        {"nine","ten"},
                        {"eleven","fifty"}
                }
        };
        String[][][] s2 = new String[][][]{
                {
                        {"one","two","three"},
                        {"four","five"}
                },
                {
                        {"six","seven"},
                        {"eight"}
                },
                {
                        {"nine","ten"},
                        {"eleven","fifty"}
                }
        };
        System.out.println("Equals: " + Arrays.equals(s1,s2));
        System.out.println("deepEquals: " + Arrays.deepEquals(s1,s2));
    }
}
