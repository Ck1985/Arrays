package example;

/**
 * Created by anonymous.vn1985 on 1/31/2017.
 */
import java.util.*;
import arrays.*;

public class SkipCollectionData<T> extends ArrayList<T> {
    public SkipCollectionData(SkipGenerator<T> skipGenerator, int quantity, int skip){
        for(int i = 0; i < quantity; i++){
            this.add(skipGenerator.next(skip));
        }
    }
}
