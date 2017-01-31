package example;

/**
 * Created by anonymous.vn1985 on 1/31/2017.
 */
import java.util.*;
import arrays.*;

public class Generated_Example16 {
   public static <T> T[] array(T[] a, SkipGenerator<T> skipGenerator, int skip){
       return new SkipCollectionData<T>(skipGenerator, a.length, skip).toArray(a);
   }
}
