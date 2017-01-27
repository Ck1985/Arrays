package example;

/**
 * Created by anonymous.vn1985 on 1/27/2017.
 */
import java.util.*;

class B{}
public class Example_8<T> {
    @SuppressWarnings("unchecked")
    T[] a = (T[])new Object[10]; //Compile time Warning: unchecked cast
    public static void main(String[] args){
        String[] sa = new String[2];
        // sa[0] = new Integer[0];  Error: Incompatible type
        Object[] oa = new Object[3];
        oa[0] = new String("Hi");
        oa[1] = new B();
        int x = 2;
        oa[2] = x;
        System.out.println("oa[2]: " + oa[2].getClass());
        oa = sa;
        System.out.println("oa: " + oa.getClass());
        oa[0] = 3; //Compile but Exception: ArrayStoreException....
    }
}
