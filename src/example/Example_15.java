package example;

/**
 * Created by anonymous.vn1985 on 1/30/2017.
 */
import java.util.*;
import arrays.*;
import net.mindview.util.*;

public class Example_15 {
    public static class BerylliumSphere implements Generator<arrays.BerylliumSphere>{
        public arrays.BerylliumSphere next(){
            return new arrays.BerylliumSphere();
        }
    }
    public static void main(String[] args){
        arrays.BerylliumSphere[] berylArray = arrays.Generated.array(arrays.BerylliumSphere.class, new Example_15.BerylliumSphere(), 10);
        System.out.println(Arrays.toString(berylArray));
    }
}
