package example;

/**
 * Created by anonymous.vn1985 on 2/4/2017.
 */
import java.util.*;
import arrays.*;


public class Example_24 {
    public static void main(String[] args){
        PlayerFootball[] team = new PlayerFootball[30];
        for(int i = 0; i < team.length; i++){
            team[i] = new PlayerFootball(i);
        }
        System.out.println(Arrays.toString(team));
        Arrays.sort(team);
        System.out.println(Arrays.binarySearch(team,team[8]));
    }
}
