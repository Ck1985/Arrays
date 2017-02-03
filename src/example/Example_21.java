package example;

/**
 * Created by anonymous on 2/3/2017.
 */
import java.util.*;
import arrays.*;

public class Example_21 {
    public static void main(String[] args){
        BerylliumSphere[] spheres = Generated.array(new BerylliumSphere[10], BerylliumSphere.generator());
        System.out.println(Arrays.toString(spheres));
        Arrays.sort(spheres);
        System.out.println(Arrays.toString(spheres));
        Arrays.sort(spheres, Collections.reverseOrder());
        System.out.println(Arrays.toString(spheres));
        BerylliumSphere[] sphere2 = Generated.array(new BerylliumSphere[10], BerylliumSphere.generator());
        Arrays.sort(sphere2, new BerylliumSphereComparator());
        System.out.println("sphere2 sort: " + Arrays.toString(sphere2));
    }
}
