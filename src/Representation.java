import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by Mariana on 25/02/16.
 */
public class Representation {

    private int col;
    private int row;
    private Grid grid;

    public Representation(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isOutsideBorder(int col, int row) {
        return col  < 0 || row < 0 || col > grid.getCols() || row > grid.getRows();
    }

    public void move(Direction direction) {


    }

    public void setColor(Color color) {
        rectangle.setColor(color);
        //rectangle.fill();
    }

}
