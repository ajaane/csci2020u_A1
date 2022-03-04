import java.util.concurrent.ThreadLocalRandom;
// This is the client
public class main {
    public static void main(String args[])
    {
        Player human = new HumanPlayer();                               // Adaptee object
        Enemy enemy = new EnemyPlayer();                                // Target object

        // The PlayerAdapter wraps enemy so that it behaves like player
        Enemy playerAdapter = new PlayerAdapter(human);                 // Adapter

        System.out.println("Player:");
        int rand = ThreadLocalRandom.current().nextInt(10, 20);
        human.punch(rand, "Player");
        human.heal();

        rand = ThreadLocalRandom.current().nextInt(10, 20);
        System.out.println("Enemy:");
        enemy.kick(rand, "Enemy");

        // Enemy is behaving like Player (punch method)
        rand = ThreadLocalRandom.current().nextInt(10, 20);
        System.out.println("playerAdapter:");
        playerAdapter.kick(rand, "Enemy");
    }
}
