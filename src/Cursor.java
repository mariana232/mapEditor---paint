import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by Mariana on 25/02/16.
 */
public class Cursor implements KeyboardHandler{

    private Keyboard k;
    private Representation representation;
    private ColorEnum currentColor = ColorEnum.WHITE;
    private boolean spaceState = false;

    public Cursor(Representation representation) {

        //keyConfig();

        this.representation = representation;

    }

    public void initKeyboard(){

        keyConfig();
    }


    public void keyConfig(){

        k = new Keyboard(this);

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

        KeyboardEvent eventWHITE = new KeyboardEvent();
        eventWHITE.setKey(KeyboardEvent.KEY_0);
        eventWHITE.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventWHITE);

        KeyboardEvent eventBLACK = new KeyboardEvent();
        eventBLACK.setKey(KeyboardEvent.KEY_1);
        eventBLACK.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventBLACK);

        KeyboardEvent eventRED = new KeyboardEvent();
        eventRED.setKey(KeyboardEvent.KEY_2);
        eventRED.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventRED);

        KeyboardEvent eventBLUE = new KeyboardEvent();
        eventBLUE.setKey(KeyboardEvent.KEY_3);
        eventBLUE.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventBLUE);

        KeyboardEvent eventYELLOW = new KeyboardEvent();
        eventYELLOW.setKey(KeyboardEvent.KEY_4);
        eventYELLOW.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventYELLOW);

        KeyboardEvent eventGREEN = new KeyboardEvent();
        eventGREEN.setKey(KeyboardEvent.KEY_5);
        eventGREEN.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventGREEN);

        KeyboardEvent eventORANGE = new KeyboardEvent();
        eventORANGE.setKey(KeyboardEvent.KEY_6);
        eventORANGE.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventORANGE);

        KeyboardEvent eventMAGENTA = new KeyboardEvent();
        eventMAGENTA.setKey(KeyboardEvent.KEY_7);
        eventMAGENTA.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventMAGENTA);

        KeyboardEvent eventCYAN = new KeyboardEvent();
        eventCYAN.setKey(KeyboardEvent.KEY_8);
        eventCYAN.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventCYAN);

        KeyboardEvent eventPINK = new KeyboardEvent();
        eventPINK.setKey(KeyboardEvent.KEY_9);
        eventPINK.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventPINK);

        KeyboardEvent eventPAINT = new KeyboardEvent();
        eventPAINT.setKey(KeyboardEvent.KEY_SPACE);
        eventPAINT.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(eventPAINT);

        KeyboardEvent eventNOPAINT = new KeyboardEvent();
        eventNOPAINT.setKey(KeyboardEvent.KEY_SPACE);
        eventNOPAINT.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        k.addEventListener(eventNOPAINT);

    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        Direction dir;

        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_UP:
                dir = Direction.UP;
                if(spaceState){
                    changeColor(currentColor);
                }
                move(dir);
                break;
            case KeyboardEvent.KEY_LEFT:
                dir = Direction.LEFT;
                if(spaceState){
                    changeColor(currentColor);
                }
                move(dir);
                break;
            case KeyboardEvent.KEY_RIGHT:
                dir = Direction.RIGHT;
                if(spaceState){
                    changeColor(currentColor);
                }
                move(dir);
                break;
            case KeyboardEvent.KEY_DOWN:
                dir = Direction.DOWN;
                if(spaceState){
                    changeColor(currentColor);
                }
                move(dir);
                break;
            case KeyboardEvent.KEY_0:
                currentColor = ColorEnum.WHITE;
                break;
            case KeyboardEvent.KEY_1:
                currentColor = ColorEnum.BLACK;
                break;
            case KeyboardEvent.KEY_2:
                currentColor = ColorEnum.RED;
                break;
            case KeyboardEvent.KEY_3:
                currentColor = ColorEnum.BLUE;
                break;
            case KeyboardEvent.KEY_4:
                currentColor = ColorEnum.YELLOW;
                break;
            case KeyboardEvent.KEY_5:
                currentColor = ColorEnum.GREEN;
                break;
            case KeyboardEvent.KEY_6:
                currentColor = ColorEnum.ORANGE;
                break;
            case KeyboardEvent.KEY_7:
                currentColor = ColorEnum.MAGENTA;
                break;
            case KeyboardEvent.KEY_8:
                currentColor = ColorEnum.CYAN;
                break;
            case KeyboardEvent.KEY_9:
                currentColor = ColorEnum.PINK;
                break;
            case KeyboardEvent.KEY_SPACE:

                if(!spaceState){
                    changeColor(currentColor);
                    spaceState = true;
                }

                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:
                spaceState = false;
                break;
        }

    }

    public void move(Direction direction){
        this.representation.move(direction);
    }

    public void changeColor(ColorEnum colorEnum) {
        this.representation.changeColor(colorEnum);
    }
}
