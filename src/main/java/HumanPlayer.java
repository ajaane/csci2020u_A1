import java.util.concurrent.ThreadLocalRandom;
// HumanPlayers implement the Player interface which lets them heal and punch enemies
public class HumanPlayer implements Player {
    public void punch(int attackPwr, String name){
        System.out.println(name + " dealt "+ attackPwr + " points of damage by punching.");
    }
    public void heal(){
        int rand = ThreadLocalRandom.current().nextInt(2, 10);
        System.out.println("Player healed by " + rand + " points of hp.");
    }

}
