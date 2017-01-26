package example;

/**
 * Created by anonymous on 1/26/2017.
 */
import java.util.*;
import arrays.*;

public class Example_5 {
    public static void main(String[] args){
        BerylliumSphere[][] sphere1 = new BerylliumSphere[3][2];
        BerylliumSphere[][][] sphere2 = new BerylliumSphere[2][2][3];
        System.out.println(Arrays.deepToString(sphere1));
        System.out.println(Arrays.deepToString(sphere2));
    }
}
