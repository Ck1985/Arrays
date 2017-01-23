package arrays;

/**
 * Created by anonymous.vn1985 on 1/23/2017.
 */
import java.util.*;

public class MultidimensionalPrimitivesArray {
    public static void main(String[] args){
        int[][] twoDimensionalArray = new int[][]{
                                                    {1,2,3},
                                                    {4,5,6}
                                                 };
        System.out.println(Arrays.deepToString(twoDimensionalArray));
        System.out.println(twoDimensionalArray.length);
        System.out.println(twoDimensionalArray[0].length);
        System.out.println(twoDimensionalArray[1].length);
    }
}
