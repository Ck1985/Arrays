package arrays;

/**
 * Created by anonymous.vn1985 on 1/30/2017.
 */
import java.util.*;

public class PrimitiveConversionDesmonstration {
    public static void main(String[] args){
        Integer[] a = Generated.array(Integer.class, new CountingGenerators.Integer(), 15);
        int[] b = ConvertTo.primitive(a);
        System.out.println(Arrays.toString(b));

        boolean[] c = ConvertTo.primitive(Generated.array(Boolean.class, new CountingGenerators.Boolean(), 10));
        System.out.println(Arrays.toString(c));
    }
}
