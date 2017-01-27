package arrays;

/**
 * Created by anonymous.vn1985 on 1/27/2017.
 */
import java.lang.reflect.Array;
import java.util.*;

public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[])la;
        ls[0] = new ArrayList<String>();
        // ls[1] = new ArrayList<Integer>(); Compile time checking procedure an error !!!
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

        List<BerylliumSphere>[] sphereList = (List<BerylliumSphere>[])(new List[10]);
        for(int i = 0; i < sphereList.length; i++){
            sphereList[i] = new ArrayList<BerylliumSphere>();
        }
    }
}
