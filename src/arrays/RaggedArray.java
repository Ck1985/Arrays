package arrays;

/**
 * Created by anonymous.vn1985 on 1/23/2017.
 */
import java.util.*;

public class RaggedArray {
    public static void showRandomArrayDimension(){
        Random random = new Random(47);
        int[][][] threeDimension = new int[random.nextInt(7)][][];
        // System.out.println(threeDimension.length);
        for(int i = 0; i < threeDimension.length; i++){
            threeDimension[i] = new int[random.nextInt(4)][];
            for(int j = 0; j < threeDimension[i].length; j++){
                threeDimension[i][j] = new int[random.nextInt(5)];
            }
        }
        System.out.println(Arrays.deepToString(threeDimension));
    }
    public static void main(String[] args){
        /*int[][][] threeDimension = new int[2][3][4];
        System.out.println(Arrays.deepToString(threeDimension));
        System.out.println("threeDimension.length = " + threeDimension.length);*/
        showRandomArrayDimension();
    }
}
