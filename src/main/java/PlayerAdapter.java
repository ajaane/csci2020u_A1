// This is the adapter. It allows the client to use the HumanPlayer class with Enemy
// which wasn't possible before since they were implemented in different interfaces
// This adapter creates a Player object (same type as the adaptee) and sends all calls to
// HumanPlayer instead of EnemyPlayer (punch is being called instead of the kick method)

public class PlayerAdapter implements Enemy {
    Player newPlayer;
    public PlayerAdapter(Player newPlayer){
        this.newPlayer = newPlayer;
    }

    public void kick(int attackPwr, String name) {
        newPlayer.punch(attackPwr, name);
    }
}
