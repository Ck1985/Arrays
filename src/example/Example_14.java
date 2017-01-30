package example;

/**
 * Created by anonymous.vn1985 on 1/30/2017.
 */
import java.util.*;
import arrays.*;

public class Example_14 {
    public static void showBooleanArray(int length){
        boolean[] result = new boolean[length];
        CountingGenerators.Boolean cg = new CountingGenerators.Boolean();
        for(int i = 0; i < length; i++){
            result[i] = cg.next();
        }
        System.out.println(Arrays.toString(result));
    }
    public static void showCharArray(int length){
        char[] result = new char[length];
        CountingGenerators.Character cg = new CountingGenerators.Character();

        for(int i = 0; i < length; i++){
            result[i] = cg.next();
        }
        System.out.println(Arrays.toString(result));
    }
    public static void showByteArray(int length){
        byte[] result = new byte[length];
        CountingGenerators.Byte cg = new CountingGenerators.Byte();
        for(int i = 0; i < length; i++){
            result[i] = cg.next();
        }
        System.out.println(Arrays.toString(result));
    }
    public static void showShortArray(int length){
        short[] result = new short[length];
        CountingGenerators.Short cg = new CountingGenerators.Short();
        for(int i = 0; i < length; i++){
            result[i] = cg.next();
        }
        System.out.println(Arrays.toString(result));
    }
    public static void showIntArray(int length){
        int[] result = new int[length];
        CountingGenerators.Integer cg = new CountingGenerators.Integer();
        for(int i = 0; i < length; i++){
            result[i] = cg.next();
        }
        System.out.println(Arrays.toString(result));
    }
    public static void showLongArray(int length){
        long[] result = new long[length];
        CountingGenerators.Long cg = new CountingGenerators.Long();
        for(int i = 0; i < length; i++){
            result[i] = cg.next();
        }
        System.out. println(Arrays.toString(result));
    }
    public static void showFloatArray(int length){
        float[] result = new float[length];
        CountingGenerators.Float cg = new CountingGenerators.Float();
        for(int i = 0; i < length; i++){
            result[i] = cg.next();
        }
        System.out.println(Arrays.toString(result));
    }
    public static void showDoubleArray(int length){
        double[] result = new double[length];
        CountingGenerators.Double cg = new CountingGenerators.Double();
        for(int i = 0; i < length; i++){
            result[i] = cg.next();
        }
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args){
        showBooleanArray(10);
        showCharArray(10);
        showShortArray(10);
        showByteArray(10);
        showIntArray(10);
        showLongArray(10);
        showFloatArray(10);
        showDoubleArray(10);
    }
}
