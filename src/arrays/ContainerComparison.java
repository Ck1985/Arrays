package arrays;
/**
 * Created by anonymous on 1/21/2017.
 */
import java.util.*;

public class ContainerComparison {
    public static void main(String[] args){
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for(int i = 0; i < 5; i++){
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        List<BerylliumSphere> sphereList = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            sphereList.add(new BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));
        Integer[] integers = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(integerList);
        System.out.println(integerList.get(4));
    }
}
