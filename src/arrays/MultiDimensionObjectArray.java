package arrays;

/**
 * Created by anonymous on 1/24/2017.
 */
import java.util.*;
import arrays.*;

public class MultiDimensionObjectArray {
    public static void main(String[] args){
        BerylliumSphere[][] sphereMultiArray = {
                {new BerylliumSphere(), new BerylliumSphere()},
                {new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere()
                },
                {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()}
        };
        System.out.println(Arrays.deepToString(sphereMultiArray));
    }
}
