// EnemyPlayers implement the Player interface which lets them kick the HumanPlayer
public class EnemyPlayer implements Enemy{
    public String getName(){return name;}
    public void kick(int attackPwr, String name){
        System.out.println(name + " dealt " + attackPwr + " points of damage by kicking.");
    }
}
