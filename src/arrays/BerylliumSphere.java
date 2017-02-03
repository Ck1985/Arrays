package arrays;
import java.util.*;
import net.mindview.util.*;

/**
 * Created by anonymous on 1/22/2017.
 */
public class BerylliumSphere implements Comparable<BerylliumSphere>{
    private static long count = 0;
    private final long id = count++;
    private static Random random = new Random(47);
    public int indexSort;
    public BerylliumSphere(){}
    public BerylliumSphere(int indexSort){
        this.indexSort = indexSort;
    }
    public int compareTo(BerylliumSphere sphere){
        return this.indexSort < sphere.indexSort ? -1 : (this.indexSort == sphere.indexSort ? 0 : 1);
    }
    public static Generator<BerylliumSphere> generator(){
        return new Generator<BerylliumSphere>(){
            public BerylliumSphere next(){
                return new BerylliumSphere(random.nextInt(100));
            }
        };
    }
    public String toString(){
        return "Sphere: " + this.indexSort;
    }
}
