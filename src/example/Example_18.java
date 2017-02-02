package example;

/**
 * Created by anonymous on 2/2/2017.
 */
import java.util.*;
import arrays.*;

public class Example_18 {
    public static void main(String[] args){
        BerylliumSphere[] sphereArray = new BerylliumSphere[10];
        // Arrays.fill(sphereArray,new BerylliumSphere());
        for(int i = 0; i < 10; i++){
            sphereArray[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(sphereArray));
        // Note: if use fill() method to fill array, this method assigns Object reference
        // to all element in array. So there is only 1 object...
        // so there is only BerylliumSphere id = 0
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        Arrays.fill(spheres,new BerylliumSphere());
        BerylliumSphere[] sphereCopy = new BerylliumSphere[10];
        // Shallow copy (only reference are copied, not object itself....
        System.arraycopy(sphereArray,0,sphereCopy,0,10);
        System.out.println(Arrays.toString(sphereArray));
    }
}
