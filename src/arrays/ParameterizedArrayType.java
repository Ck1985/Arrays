package arrays;

/**
 * Created by anonymous.vn1985 on 1/27/2017.
 */
import java.lang.reflect.Array;
import java.util.*;

class ClassParameter<T>{
    public T[] f(T[] arg){
        return arg;
    }
}
class MethodParameter{
    public static <T> T[] f(T[] arg){
        // T[] array = new T[10]; Illegal !!!
        return arg;
    }
}
class Peel<T> extends ArrayList<T>{

}
class Banana{}
public class ParameterizedArrayType {
    public static void main(String[] args){
        Integer[] ints1 = {1,2,3,4,5};
        Double[] doubles1 = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] ints2 = new ClassParameter<Integer>().f(ints1);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles1);
        ints2 = MethodParameter.f(ints1);
        doubles2 = MethodParameter.f(doubles1);
        // can not initialization array parameterized and generic array
        // List<String>[] listStringArray = new List<String>[10]; Illegal !!!!
        // Peel<Banana>[] array = new Peel<Banana>[10];
    }
}
