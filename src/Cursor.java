import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by Mariana on 25/02/16.
 */
public class Cursor implements KeyboardHandler{

    private Keyboard k = new Keyboard(this);
    private Rectangle square;
    private Representation representation;

    public Cursor(int col, int row, int cellSize) {
        square = new Rectangle(col*cellSize, row*cellSize, cellSize, cellSize);
        square.setColor(Color.YELLOW);
        keyConfig();
    }

    public void keyConfig(){

        KeyboardEvent eventUP = new KeyboardEvent();
        eventUP.setKey(KeyboardEvent.KEY_UP);
        eventUP.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventUP);

        KeyboardEvent eventLEFT = new KeyboardEvent();
        eventLEFT.setKey(KeyboardEvent.KEY_LEFT);
        eventLEFT.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventLEFT);

        KeyboardEvent eventRIGHT = new KeyboardEvent();
        eventRIGHT.setKey(KeyboardEvent.KEY_RIGHT);
        eventRIGHT.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventRIGHT);

        KeyboardEvent eventDOWN = new KeyboardEvent();
        eventDOWN.setKey(KeyboardEvent.KEY_DOWN);
        eventDOWN.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventDOWN);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        Direction dir;

        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_UP:
                dir = Direction.UP;
                move(dir);
                break;
            case KeyboardEvent.KEY_LEFT:
                dir = Direction.LEFT;
                move(dir);
                break;
            case KeyboardEvent.KEY_RIGHT:
                dir = Direction.RIGHT;
                move(dir);
                break;
            case KeyboardEvent.KEY_DOWN:
                dir = Direction.DOWN;
                move(dir);
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void move(Direction direction){
        representation.move(direction);
    }
}
