package example;

/**
 * Created by anonymous.vn1985 on 1/27/2017.
 */
import java.util.*;
import arrays.*;

public class Example_7 {
    public static BerylliumSphere[][][] create3DArray(int size1, int size2, int size3){
        BerylliumSphere[][][] arraySphere = new BerylliumSphere[size1][size2][size3];
        for(int i = 0; i < size1; i++){
            arraySphere[i] = new BerylliumSphere[size2][size3];
            arraySphere[i] = Example_6.createArray(size2, size3);
        }
        return arraySphere;
    }
    public static <T> void show3DArray(T[][][] array){
        Example_6.showArray(array);
    }
    public static void main(String[] args){
        show3DArray(create3DArray(3,2,4));
        show3DArray(create3DArray(2,5,3));
    }
}
