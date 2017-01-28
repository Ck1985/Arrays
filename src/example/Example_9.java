package example;

/**
 * Created by anonymous on 1/28/2017.
 */
import java.util.*;

class Banana{
    private static long count = 0;
    private final long id = count++;
    public String toString(){
        return "Banana: " + this.id;
    }
}
class Peel<T>{
    private T t;
    private static long count = 0;
    private final long id = count++;
    public Peel(T t){
        this.t = t;
    }
    public String toString(){
        return "Peel " + this.id + "has " + this.t.toString();
    }
}
public class Example_9 {
    public static void main(String[] args){
        // Peel<Banana>[] peelArray = new Peel<Banana>[10]; Compile time error
        List<Peel<Banana>> peelList = new ArrayList<Peel<Banana>>(); // Container is ok
        for(int i = 0; i < 10; i++){
            peelList.add(new Peel<>(new Banana()));
        }
        System.out.println(peelList);
        System.out.println("peelList[0].getClass(): " + peelList.get(0).getClass());
    }
}
