package arrays;

/**
 * Created by anonymous on 1/28/2017.
 */
import net.mindview.util.*;

public class GeneratorTest {
    public static int size = 10;
    public static void test(Class<?> surroundClass){
        for(Class<?> type : surroundClass.getClasses()){
            System.out.print(type.getSimpleName() + ": ");
            try{
                Generator<?> gc = (Generator<?>)type.newInstance();
                for(int i = 0; i < size; i++){
                    System.out.print(gc.next() + " ");
                }
                System.out.println();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args){
        test(CountingGenerators.class);
        test(RandomGenerators.class);
    }
}
