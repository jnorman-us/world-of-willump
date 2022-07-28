import ai.ClientAI;
import types.Action;
import types.Vector;

import java.io.IOException;

public class YourAI extends ClientAI {
    public static void main(String[] args) {
        try {
            new YourAI();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public YourAI() throws IOException {
        super("127.0.0.1", 9090, "username", "password");
    }

    @Override
    public void start() {
        // put logic here for the start of the match
    }

    @Override
    public Action think() {
        System.out.println(getPosition());
        System.out.println(isShiny());
        System.out.println(isSmelly());
        System.out.println(isWindy());
        return Action.MOVE_DOWN;
    }

    @Override
    public void died() {
        // put logic here to be fired when your player dies.
    }

    @Override
    public void goldAcquired(Vector position) {
        // put logic here to be fired when your player collects gold
    }
}
