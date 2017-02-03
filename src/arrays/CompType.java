package arrays;

/**
 * Created by anonymous on 2/3/2017.
 */
import java.util.*;
import net.mindview.util.*;

public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count = 0;
    public CompType(int n1, int n2){
        this.i = n1;
        this.j = n2;
    }
    public String toString(){
        String result = "[i = " + i + ", j = " + j + "]";
        if(this.count++ % 3 == 0){
            result += "\n";
        }
        return result;
    }
    public int compareTo(CompType rv){
        return this.i < rv.i ? -1 : (this.i == rv.i ? 0 : 1);
    }
    public static Random random = new Random(47);
    public static Generator<CompType> generator(){
        return new Generator<CompType>(){
            public CompType next(){
                return new CompType(random.nextInt(100), random.nextInt(100));
            }
        };
    }
    public static void main(String[] args){
        CompType[] array = Generated.array(new CompType[10],CompType.generator());
        System.out.println("Before sorting array: " + "\n" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting array: " + "\n" + Arrays.toString(array));
    }
}
