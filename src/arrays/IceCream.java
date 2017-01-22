package arrays;

/**
 * Created by anonymous on 1/22/2017.
 */
import java.util.*;

public class IceCream {
    private static Random random = new Random(47);
    static final String[] FLAVOR = new String[]{
            "Chocolate", "Strawberry", "Vanila Fudge Swirl",
            "Mind Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    public static String[] flavorSet(int n){
        if(n > FLAVOR.length){
            throw new IllegalArgumentException("Set too big");
        }else{
            String[] result = new String[n];
            boolean[] picked = new boolean[FLAVOR.length];
            for(int i = 0; i < n; i++){
                int j;
                do{
                    j = random.nextInt(FLAVOR.length);
                }while(picked[j]);
                result[i] = FLAVOR[j];
                picked[j] = true;
            }
            return result;
        }
    }
    public static void main(String[] args){
        for(int i = 1; i < 7; i++) {
            System.out.println(Arrays.toString(flavorSet(3)));
        }
    }
}
