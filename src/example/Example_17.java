package example;

/**
 * Created by anonymous.vn1985 on 1/31/2017.
 */
import java.util.*;
import arrays.*;
import net.mindview.util.*;

class BigDecimalExample_17{
    public static class BigDecimal implements Generator<java.math.BigDecimal>{
        private java.math.BigDecimal value = new java.math.BigDecimal(0);
        public java.math.BigDecimal next(){
            java.math.BigDecimal result = value;
            value = value.add(new java.math.BigDecimal(1));
            return result;
        }
    }
}
public class Example_17 {
    public static void main(String[] args){
        java.math.BigDecimal[] arrayBigDecimal = arrays.Generated.array(new java.math.BigDecimal[10], new BigDecimalExample_17.BigDecimal());
        System.out.println(Arrays.toString(arrayBigDecimal));
    }
}
