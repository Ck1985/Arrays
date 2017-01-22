package arrays;

/**
 * Created by anonymous on 1/22/2017.
 */
public class BerylliumSphere {
    private static long count = 0;
    private final long id = count++;
    public String toString(){
        return "Sphere: " + this.id;
    }
}
