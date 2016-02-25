import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 25/02/16.
 */
public enum ColorEnum {
    WHITE(Color.WHITE),
    BLACK(Color.BLACK),
    RED(Color.RED),
    BLUE(Color.BLUE),
    GREEN(Color.GREEN),
    ORANGE(Color.ORANGE),
    MAGENTA(Color.MAGENTA),
    GRAY(Color.GRAY),
    CYAN(Color.CYAN),
    PINK(Color.PINK);

    //private int colorNumber;
    private Color color;

    ColorEnum(Color color) {
        //this.colorNumber = colorNumber;
        this.color = color;
    }

    public Color getColor(int colorIndex){
        return ColorEnum.values()[colorIndex].color;
    }

    public Color getColor(ColorEnum colorEnum){
        return colorEnum.color;
    }

}
