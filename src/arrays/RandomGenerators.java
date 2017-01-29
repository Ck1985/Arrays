package arrays;

/**
 * Created by anonymous on 1/29/2017.
 */
import java.util.*;
import net.mindview.util.*;

public class RandomGenerators {
    private static Random random = new Random(47);
    public static class Boolean implements Generator<java.lang.Boolean>{
        public java.lang.Boolean next(){
            return random.nextBoolean();
        }
    }
    public static class Byte implements Generator<java.lang.Byte>{
        public java.lang.Byte next(){
            return (byte)random.nextInt();
        }
    }
    public static class Character implements Generator<java.lang.Character>{
        public java.lang.Character next(){
            return CountingGenerators.chars[random.nextInt(CountingGenerators.chars.length)];
        }
    }
    public static class String extends CountingGenerators.String{
        {
            cg = new Character();
        }
        public String(){}
        public String(int length){
            super(length);
        }
    }
    public static class Short implements Generator<java.lang.Short>{
        public java.lang.Short next(){
            return (short)random.nextInt();
        }
    }
    public static class Integer implements Generator<java.lang.Integer>{
        private int modulo = 1000;
        public Integer(){}
        public Integer(int modulo){
            this.modulo = modulo;
        }
        public java.lang.Integer next(){
            return random.nextInt(modulo);
        }
    }
    public static class Long implements Generator<java.lang.Long>{
        private int modulo = 1000;
        public Long(){}
        public Long(int modulo){
            this.modulo = modulo;
        }
        public java.lang.Long next(){
            return new java.lang.Long(random.nextInt(modulo));
        }
    }
    public static class Float implements Generator<java.lang.Float>{
        public java.lang.Float next(){
            int trimmed = Math.round(random.nextFloat() * 100);
            return ((float)trimmed) / 100;
        }
    }
    public static class Double implements Generator<java.lang.Double>{
        public java.lang.Double next(){
            long trimmed = Math.round(random.nextDouble() * 100);
            return (double)trimmed / 100;
        }
    }
}
