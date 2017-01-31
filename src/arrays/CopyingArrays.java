package arrays;

/**
 * Created by anonymous.vn1985 on 1/31/2017.
 */
import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args){
        int[] i = new int[7];
        int[] j = new int[10];
        Arrays.fill(i,47);
        Arrays.fill(j,99);
        System.out.println("i: " + Arrays.toString(i));
        System.out.println("j: " + Arrays.toString(j));
    }
}
