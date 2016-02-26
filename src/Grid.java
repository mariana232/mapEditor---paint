import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by João Romero on 25/02/16.
 */
public class Grid {

    private int BORDER_SIZE = 0;
    private int cols;
    private int rows;
    private int cellSize;
    private Rectangle field;
    private Cell[] cells;

    public Grid (int cellSize, int width, int height) {
        this.cellSize = cellSize;

        cols = width / cellSize;
        rows = height / cellSize;

        cells = new Cell[cols * rows];
    }

    public int getCellSize() {
        return cellSize;
    }

    public int getWidth() {
        return cols * cellSize;
    }

    public int getHeight () {
        return rows * cellSize;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    public void init() {
        field = new Rectangle(BORDER_SIZE, BORDER_SIZE, getWidth(), getHeight());
        field.setColor(Color.BLACK);
        field.draw();

        createGrid();
    }

    public void createGrid() {
        int count = 0;
        Cell cell;

        for (int i = 0; i < cols; i++) {
            int x = BORDER_SIZE + cellSize * i;
            for (int j = 0; j < rows; j++) {
                int y = BORDER_SIZE + cellSize * j;
                cell = new Cell(x, y, cellSize);
                cell.draw();
                cells[count] = cell;
                count++;
            }
        }
    }

    public void paintCell(int col, int row) {
        int index = col * (rows - 1) + row + col;
        cells[index].paint();
    }

    public boolean isCellPainted(int col, int row) {
        int index = col * (rows - 1) + row + col;
        return cells[index].isPainted();
    }


}
