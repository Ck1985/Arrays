package example;

/**
 * Created by anonymous on 1/30/2017.
 */
import java.util.*;
import arrays.*;

public class TestArrayGenerator {
    public static void main(String[] args){
        int size = 6;
        int skip = 7;
        boolean[] a1 = ConvertTo.primitive(Generated_Example16.array(new Boolean[size], new Example_16.Boolean(skip), skip));
        System.out.println(Arrays.toString(a1));
        char[] a2 = ConvertTo.primitive(Generated_Example16.array(new Character[size], new Example_16.Character(skip),skip));
        System.out.println(Arrays.toString(a2));
        byte[] a3 = ConvertTo.primitive(Generated_Example16.array(new Byte[size],new Example_16.Byte(skip),skip));
        System.out.println(Arrays.toString(a3));
        short[] a4 = ConvertTo.primitive(Generated_Example16.array(new Short[size],new Example_16.Short(skip),skip));
        System.out.println(Arrays.toString(a4));
        int[] a5 = ConvertTo.primitive(Generated_Example16.array(new Integer[size], new Example_16.Integer(skip),skip));
        System.out.println(Arrays.toString(a5));
        long[] a6 = ConvertTo.primitive(Generated_Example16.array(new Long[size],new Example_16.Long(skip),skip));
        System.out.println(Arrays.toString(a6));
        float[] a7 = ConvertTo.primitive(Generated_Example16.array(new Float[size],new Example_16.Float(skip),skip));
        System.out.println(Arrays.toString(a7));
        double[] a8 = ConvertTo.primitive(Generated_Example16.array(new Double[size], new Example_16.Double(skip), skip));
        System.out.println(Arrays.toString(a8));
    }
}
