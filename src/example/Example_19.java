package example;

/**
 * Created by anonymous on 2/2/2017.
 */
import java.util.*;

class PlayerFootball implements Comparable<PlayerFootball>{
    private int numberPlayer;
    private Random random = new Random(47);
    public PlayerFootball(int numberPlayer){
        this.numberPlayer = numberPlayer;
    }
    public boolean equals(Object player){
        return player.getClass().getSimpleName().equals("PlayerFootball") &&
                this.numberPlayer == ((PlayerFootball)player).numberPlayer ? true : false;
    }
    public int compareTo(PlayerFootball player){
        return this.numberPlayer < player.numberPlayer ? -1 : (this.numberPlayer == player.numberPlayer ? 0 : 1);
    }
    public String toString(){
        return "PlayerFootball: " + this.numberPlayer;
    }
}
public class Example_19 {
    public static void main(String[] args){
        PlayerFootball[] teamA = new PlayerFootball[11];
        PlayerFootball[] teamB = new PlayerFootball[11];
        for(int i = 0; i < 11; i++){
            teamA[i] = new PlayerFootball(i);
            teamB[i] = new PlayerFootball(i);
        }
        System.out.println(teamA[0].getClass().getSimpleName());
        System.out.println(teamB[0].getClass().getSimpleName());
        System.out.println(teamA[0].equals(teamB[0]));
        System.out.println(Arrays.toString(teamA));
        System.out.println(Arrays.toString(teamB));
        System.out.println("teamA = teamB: " + Arrays.equals(teamA,teamB));
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1.equals(i2));
        PlayerFootball p1 = new PlayerFootball((byte)10);
        PlayerFootball p2 = new PlayerFootball((byte)10);
        System.out.println(p1.equals(p2));
        // System.out.println(p1.getClass().getSimpleName());
    }
}
