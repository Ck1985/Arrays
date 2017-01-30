package arrays;

/**
 * Created by anonymous.vn1985 on 1/30/2017.
 */
import java.util.*;

public class TestArrayGeneration {
    public static void main(String[] args){
        boolean[] a1 = ConvertTo.primitive(Generated.array(Boolean.class, new RandomGenerators.Boolean(), 10));
        System.out.println("a1: " + Arrays.toString(a1));
        char[] a2 = ConvertTo.primitive(Generated.array(Character.class, new RandomGenerators.Character(), 10));
        System.out.println("a2: " + Arrays.toString(a2));
        byte[] a3 = ConvertTo.primitive(Generated.array(Byte.class, new RandomGenerators.Byte(),10));
        System.out.println("a3: " + Arrays.toString(a3));
        short[] a4 = ConvertTo.primitive(Generated.array(Short.class, new RandomGenerators.Short(), 10));
        System.out.println("a4: " + Arrays.toString(a4));
        int[] a5 = ConvertTo.primitive(Generated.array(Integer.class, new RandomGenerators.Integer(), 10));
        System.out.println("a5: " + Arrays.toString(a5));
        long[] a6 = ConvertTo.primitive(Generated.array(Long.class, new RandomGenerators.Long(), 10));
        System.out.println("a6: " + Arrays.toString(a6));
        float[] a7 = ConvertTo.primitive(Generated.array(Float.class, new RandomGenerators.Float(), 10));
        System.out.println("a7: " + Arrays.toString(a6));
        double[] a8 = ConvertTo.primitive(Generated.array(Double.class, new RandomGenerators.Double(), 10));
        System.out.println("a8: " + Arrays.toString(a8));
    }
}
