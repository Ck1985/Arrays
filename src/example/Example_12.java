package example;

/**
 * Created by anonymous.vn1985 on 1/30/2017.
 */
import java.util.*;
import arrays.*;

public class Example_12 {
    public static void main(String[] args){
        double[] doubleArray = new double[10];
        CountingGenerators.Double doubleGenerator = new CountingGenerators.Double();
        for(int i = 0; i < doubleArray.length; i++){
            doubleArray[i] = doubleGenerator.next();
        }
        System.out.println(Arrays.toString(doubleArray));
    }
}
