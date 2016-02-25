import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by João Romero on 25/02/16.
 */
public class Cell {

    private Rectangle square;
    private boolean painted;

    public Cell(int x, int y , int cellSize) {
        square = new Rectangle(x, y, cellSize, cellSize);
        square.setColor(Color.BLACK);
    }

    public void paint() {
        this.painted = true;
    }

    public boolean isPainted() {
        return painted;
    }

    public void draw() {
        square.draw();
    }

}
