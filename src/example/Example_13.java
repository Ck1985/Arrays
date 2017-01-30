package example;

/**
 * Created by anonymous.vn1985 on 1/30/2017.
 */
import java.util.*;
import arrays.*;

public class Example_13 {
    public static String fillString(int length){
        char[] ca = new char[length];
        CountingGenerators.Character cg = new CountingGenerators.Character();
        for(int i = 0; i < length; i++){
            ca[i] = cg.next();
        }
        return new String(ca);
    }
    public static void main(String[] args){
        String myString = fillString(15);
        System.out.println(myString);
    }
}
