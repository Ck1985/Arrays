package arrays;

/**
 * Created by anonymous on 2/2/2017.
 */
import java.util.*;

public class CompairingArrays {
    public static void main(String[] args){
        int[] i = new int[10];
        int[] j = new int[10];
        Arrays.fill(i,47);
        Arrays.fill(j,47);
        System.out.println("i = j: " + Arrays.equals(i,j));
        i[2] = 100;
        System.out.println("i = j: " + Arrays.equals(i,j));
        String[] a1 = new String[4];
        Arrays.fill(a1,new String("anonymous.vn1985"));
        String[] a2 = new String[]{
                new String("anonymous.vn1985"),
                new String("anonymous.vn1985"),
                new String("anonymous.vn1985"),
                new String("anonymous.vn1985")
        };
        System.out.println("a1 = a2: " + Arrays.equals(a1,a2));
    }
}
