package arrays;

/**
 * Created by anonymous on 1/22/2017.
 */
import java.util.*;

public class ArraysOptions {
    public static void hide(BerylliumSphere[] array){
        // statement........
    }
    public static void main(String[] args){
        BerylliumSphere[] a; // local uninitialized variable;
        // System.out.println(a);
        BerylliumSphere[] b = new BerylliumSphere[5];
        //all references inside array b automatic initialize to null
        System.out.println("b: " + Arrays.toString(b));
        BerylliumSphere[] c = new BerylliumSphere[4];
        for(int i = 0; i < c.length; i++){
            if(c[i] == null){//We can check elemwnt is null or not
                c[i] = new BerylliumSphere();
            }
        }
        // Aggregate Initialize
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        // Dynamic aggregate initialize
        a = new BerylliumSphere[]{
                new BerylliumSphere(),
                new BerylliumSphere(),
        };
        System.out.println("a.length = " + a.length);
        System.out.println("b.lengrh = " + b.length);
        System.out.println("c.lwngth = " + c.length);
        System.out.println("d.lengrh = " + d.length);
        a = d;
        System.out.println("a.length = " + a.length);
        hide(d);
        hide(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});

        // Array of primitive
        int[] e;
        int[] f = new int[5];
        System.out.println(Arrays.toString(f));
        int[] g = new int[5];
        for(int i = 0; i < g.length; i++){
            if(g[i] == 0){
                g[i] = i;
            }
        }
        int[] k = new int[]{1,2,3,4,5,6};
        e = new int[]{1,2,3,4,5};
        e = k;
        System.out.println("e.length = " + e.length);
        System.out.println("f.length = " + f.length);
        System.out.println("k.length = " + k.length);
        System.out.println("g.length = " + g.length);
    }
}
