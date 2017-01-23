package example;

/**
 * Created by anonymous.vn1985 on 1/23/2017.
 */
import java.util.*;
import arrays.*;

public class Example_2 {
    public static BerylliumSphere[] returnArray(int sizeArray){
        BerylliumSphere[] result = new BerylliumSphere[sizeArray];
        for(int i = 0; i < sizeArray; i++){
            result[i] = new BerylliumSphere();
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(returnArray(5)));
    }
}
