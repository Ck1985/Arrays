package example;

/**
 * Created by anonymous.vn1985 on 2/4/2017.
 */
import java.util.*;

import arrays.Generated;
import net.mindview.util.*;
import arrays.*;

public class Example_23 {
    public static void main(String[] args){
        Integer[] integers = Generated.array(new Integer[20],new RandomGenerators.Integer(1000));
        Arrays.sort(integers,Collections.reverseOrder());
        System.out.println(Arrays.toString(integers));
    }
}
