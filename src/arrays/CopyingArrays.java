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
        System.arraycopy(i, 0, j,0,i.length);
        System.out.println("j: " + Arrays.toString(j));
        int[] k = new int[5];
        Arrays.fill(k,103);
        System.out.println("k: " + Arrays.toString(k));
        System.arraycopy(i,0,k,0,2);
        System.out.println("k: " + Arrays.toString(k));
        Arrays.fill(k, 103);
        System.arraycopy(k,0,i,0,k.length);
        System.out.println("i: " + Arrays.toString(i));
        Integer[] u = new Integer[10];
        Integer[] v = new Integer[5];
        Arrays.fill(u,new Integer(25));
        Arrays.fill(v,new Integer(30));
        System.out.println("u: " + Arrays.toString(u));
        System.out.println("v: " + Arrays.toString(v));
        System.arraycopy(v,1,u,2,4);
        System.out.println("u: " + Arrays.toString(u));
    }
}
