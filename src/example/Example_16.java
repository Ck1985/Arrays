package example;

/**
 * Created by anonymous on 1/30/2017.
 */
import arrays.*;
import java.util.*;

public class Example_16 {
    public static class Boolean implements SkipGenerator<java.lang.Boolean>{
        private boolean value = false;
        private int n = 0;
        public Boolean(int n){
            this.n = n;
        }
        public java.lang.Boolean next(){
            return !this.value;
        }
        public java.lang.Boolean next(int n){
            this.value = n % 2 == 0 ? true : false;
            return this.value;
        }
    }
    public static class Byte implements SkipGenerator<java.lang.Byte>{
        private byte value = 0;
        private int n = 0;
        public Byte(int n){
            this.n = n;
        }
        public java.lang.Byte next(){
            return this.value++;
        }
        public java.lang.Byte next(int n){
            return this.value += n;
        }
    }
    static final char[] CHARS = ("abcdefghijklmnopqrswxy" + "ABCDEFGHIJKLMNOPQRSWXY").toCharArray();
    public static class Character implements SkipGenerator<java.lang.Character>{
        private int index = -1;
        private int n = 0;
        public Character(int n){
            this.n = n;
        }
        public java.lang.Character next(){
            index = (this.index + 1) % CHARS.length;
            return CHARS[this.index];
        }
        public java.lang.Character next(int n){
            this.index = (this.index + 1 + n) % CHARS.length;
            return CHARS[this.index];
        }
    }
    public static class String implements SkipGenerator<java.lang.String>{
        private int length = 10;
        private int n = 0;
        private Example_16.Character cg = new Example_16.Character(this.n);
        public String(){}
        public String(int n){
            this.n = n;
        }
        public java.lang.String next(){
            char[] bufferChar = new char[this.length];
            for(int i = 0; i < length; i++){
                bufferChar[i] = cg.next();
            }
            return new java.lang.String(bufferChar);
        }
        public java.lang.String next(int n){
            this.n = n;
            char[] bufferChar = new char[length];
            for(int i = 0; i < length; i++){
                bufferChar[i] = cg.next(this.n);
            }
            return new java.lang.String(bufferChar);
        }
    }
    public static class Short implements SkipGenerator<java.lang.Short>{
        private short value = 0;
        private int n= 0;
        public Short(int n){
            this.n = n;
        }
        public java.lang.Short next(){
            return this.value++;
        }
        public java.lang.Short next(int n){
            return this.value += n;
        }
    }
    public static class Integer implements SkipGenerator<java.lang.Integer>{
        private int value = 0;
        private int n = 0;
        public Integer(int n){
            this.n = n;
        }
        public java.lang.Integer next(){
            return this.value++;
        }
        public java.lang.Integer next(int n){
            return this.value += n;
        }
    }
    public static class Long implements SkipGenerator<java.lang.Long>{
        private long value = 0;
        private int n = 0;
        public Long(int n){
            this.n = n;
        }
        public java.lang.Long next(){
            return this.value;
        }
        public java.lang.Long next(int n){
            return this.value += n;
        }
    }
    public static class Float implements SkipGenerator<java.lang.Float>{
        private float value = 0;
        private int n = 0;
        public Float(int n){
            this.n = n;
        }
        public java.lang.Float next(){
            float result = value;
            this.value += 1.0;
            return result;
        }
        public java.lang.Float next(int n){
            float result = value;
            value += 1.0*n;
            return result;
        }
    }
    public static class Double implements SkipGenerator<java.lang.Double>{
        private double value = 0;
        private int n = 0;
        public Double(int n){
            this.n = n;
        }
        public java.lang.Double next(){
            double result = value;
            value += 1.0;
            return result;
        }
        public java.lang.Double next(int n){
            double result = value;
            value = 1.0 * n;
            return result;
        }
    }
}
