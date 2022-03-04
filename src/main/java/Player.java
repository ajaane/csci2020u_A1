// This is the adaptee (object being adapted). The adapter calls the method defined here, punch
// when the client thinks it's using the interface, Enemy

// Implemented by HumanPlayers
public interface Player {
    public void punch(int attackPwr, String name);
    public void heal();
}
