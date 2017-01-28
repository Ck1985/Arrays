package example;

/**
 * Created by anonymous on 1/28/2017.
 */
import java.util.*;
import arrays.*;

public class Example_10 {
    public static void main(String[] args){
        List<List<String>> lls = new ArrayList<List<String>>();
        List<List> lla = new ArrayList<List>();
        // lls = (List<List<String>>)lla; Inconvertible types !!!
        lls.add(new ArrayList<String>());
        // lls.add(new ArrayList<Integer>());
        List<Object> lo = new ArrayList<Object>();
        // lo = lls;
        //Eliminate Compile time warning...
        List<List<BerylliumSphere>> llb = new ArrayList<List<BerylliumSphere>>();
        for(int i = 0; i < 10; i++){
            llb.add(new ArrayList<BerylliumSphere>());
            for(int j = 0; j < 10; j++){
                llb.get(0).add(new BerylliumSphere());
            }
        }
        System.out.println(llb);
    }
}
