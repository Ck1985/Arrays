package example;

/**
 * Created by anonymous.vn1985 on 1/30/2017.
 */
public class Example_11 {
    public static void main(String[] args){
        int[] ia = new int[10];
        ia[0] = new Integer(1);
        ia[1] = new Integer(2);
        System.out.println(ia.getClass().getName());

        Integer[] Ia = new Integer[10];
        Ia[0] = (int)1;
        Ia[1] = (int)2;
        System.out.println(Ia.getClass().getName());
        System.out.println(Ia[0] instanceof Integer);

        /*for(int i = 0; i < Ia.length; i++){
            System.out.println(Ia[i].getClass().getName());
        }*/
        // ia = Ia; Error
        Ia[0] = (int)ia[0];
        System.out.println(Ia[0].getClass().getName());
    }
}
