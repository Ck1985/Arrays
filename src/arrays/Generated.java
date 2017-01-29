package arrays;

/**
 * Created by anonymous on 1/29/2017.
 */
import java.util.*;
import net.mindview.util.*;
import java.lang.reflect.*;

public class Generated {
    // Fill a existing array:
    public static <T> T[] array(T[] a, Generator<T> generator){
        return new CollectionData<T>(generator, a.length).toArray(a);
    }
    // Creating a new array
    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> typeArray, Generator<T> gen, int size){
        T[] a = (T[])Array.newInstance(typeArray, size);
        return new CollectionData<T>(gen, size).toArray(a);
    }
}
