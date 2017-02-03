package arrays;

/**
 * Created by anonymous on 2/3/2017.
 */
import java.util.*;
import net.mindview.util.*;

class CompTypeComparator implements Comparator<CompType>{
    public int compare(CompType com1, CompType com2){
        return com1.j < com2.j ? -1 : (com1.j == com2.j ? 0 : 1);
    }
}
public class ComparatorTest{
    public static void main(String[] args){
        CompType[] array = Generated.array(new CompType[12], CompType.generator());
        Arrays.sort(array, new CompTypeComparator());
        System.out.println(Arrays.toString(array));
    }
}
