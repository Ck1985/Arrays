package arrays;

/**
 * Created by anonymous.vn1985 on 1/27/2017.
 */
import java.util.*;

public class ArrayOfGenericsType<T> {
    T[] array; // OK
    @SuppressWarnings("unchecked")
    public ArrayOfGenericsType(int size){
        // array = new T[size]; Illegal
        array = (T[])new Object[size]; // Unchecked Warning
    }
    //public static <U> U[] makeArray(){
        // return new U[10]; Illegal
    //}
    public static void main(String[] args){

    }
}
