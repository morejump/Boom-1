import java.io.IOException;

/**
 * Created by admin on 6/11/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        GameWindow gameWindow = new GameWindow();
        Thread thread = new Thread(gameWindow);
        thread.start();
    }
}
