import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by Mariana on 25/02/16.
 */
public class Field{
    public static int cols;
    public static int rows;
    public static int cellSize;

    public static final int OFFSET =10;
    public static Rectangle rectangle;

    public static void init(int cols, int rows, int cellSize){
        Field.cols = cols;
        Field.rows = rows;

        rectangle = new Rectangle(OFFSET, OFFSET, cols*cellSize, rows*cellSize);
        rectangle.setColor(Color.BLACK);
        rectangle.fill();
    }
}
