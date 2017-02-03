package example;

import arrays.BerylliumSphere;
import java.util.*;

/**
 * Created by anonymous on 2/3/2017.
 */
public class BerylliumSphereComparator implements Comparator<BerylliumSphere>{
    public int compare(BerylliumSphere obj1, BerylliumSphere obj2){
        return obj1.indexSort < obj2.indexSort ? 1 : (obj1.indexSort == obj2.indexSort ? 0 : -1);
    }
}
