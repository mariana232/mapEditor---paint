import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 25/02/16.
 */
public enum ColorEnum {
    WHITE(Color.WHITE),//0
    BLACK(Color.BLACK),//1
    RED(Color.RED),//2
    BLUE(Color.BLUE),//3
    YELLOW(Color.YELLOW),//4
    GREEN(Color.GREEN),//5
    ORANGE(Color.ORANGE),//6
    MAGENTA(Color.MAGENTA),//7
    CYAN(Color.CYAN),//8
    PINK(Color.PINK);//9

    //private int colorNumber;
    private Color color;

    ColorEnum(Color color) {
        //this.colorNumber = colorNumber;
        this.color = color;
    }

    public Color getColor(int colorIndex){
        return ColorEnum.values()[colorIndex].color;
    }

    public Color getColor(){
        return this.color;
    }

}
