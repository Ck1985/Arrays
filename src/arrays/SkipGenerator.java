package arrays;

/**
 * Created by anonymous on 1/30/2017.
 */
import net.mindview.util.*;

public interface SkipGenerator<T> extends Generator<T>{
    T next();
    T next(int n);
}
