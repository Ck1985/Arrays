package example;

/**
 * Created by anonymous on 1/22/2017.
 */
import java.util.*;
import arrays.*;

class A{
    public String toString(){
        return "A Object";
    }
}
public class Example_1 {
    private static <T> void takeArray(T[] tArray){
        System.out.println(Arrays.asList(tArray));
    }
    private static void takeArray(BerylliumSphere[] berylarray){
        System.out.println(Arrays.asList(berylarray));
    }
    private static void takeArray(int[] intArray){
        System.out.println(Arrays.toString(intArray));
    }
    public static void main(String[] args){
        System.out.println("For objects, e.g: berylliumSphere");
        // Array is created and initialized, but all elements are
        //initialized to null (aggregate initialized)
        takeArray(new BerylliumSphere[5]);
        //Array is created and initialized to BerylliumSphere object
        //(Dynamic aggregate initialize
        takeArray(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});
        // aggregate initialize is working by this way
        BerylliumSphere[] a = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        takeArray(a);
        // All elements initialized to null
        BerylliumSphere[] bsa = new BerylliumSphere[4];
        takeArray(bsa);
        bsa = a;
        takeArray(bsa);
        System.out.println("--------------");
        System.out.println("For primitive, e.g int");
        // Dynamic aggregate works but redundant , since
        // all element initialized to 0
        takeArray(new int[]{0,0,0});
        takeArray(new int[3]);
        // Ordinary aggregate initialize
        int[] c = {1,2,3,4,5};
        takeArray(c);
    }
}
