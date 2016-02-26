import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by Mariana on 25/02/16.
 */
public class Representation {


    private Rectangle field=null;
    private Rectangle[][] gridSquares=null;
    private Rectangle[][] cells=null;
    private int[][] grid;

    private Cursor cursor;

    private Rectangle cursorShape;
    private int cursorRow;
    private int cursorCol;



    public void initRepresentation(int[][] grid) {
        this.grid = grid;

        if (gridSquares != null) {

            for (int i = 0; i < gridSquares[0].length; i++) {
                for (int j = 0; j < gridSquares.length; j++) {
                    gridSquares[i][j].delete();
                }
            }
        }

        if (cells != null) {

            for (int i = 0; i < cells[0].length; i++) {
                for (int j = 0; j < cells.length; j++) {
                    cells[i][j].delete();
                }
            }
        }

        gridSquares = new Rectangle[Config.GRID_ROWS][Config.GRID_COLUMNS];
        cells = new Rectangle[Config.GRID_ROWS][Config.GRID_COLUMNS];


    }


    private int GridRowToY(int row) {
        return Config.BORDER_X + Config.GRID_SIZE * row;
    }

    private int GridColToX(int col) {
        return Config.BORDER_Y + Config.GRID_SIZE * col;
    }

    private int cellsRowToY(int row) {
        return GridRowToY(row) + Config.GRID_SPACING;
    }

    private int cellsColToX(int col) {
        return GridColToX(col) + Config.GRID_SPACING;
    }

    public void createCanvas() {

        if (field != null) {
            field.delete();
        }

        field = new Rectangle(Config.BORDER_X, Config.BORDER_Y, (Config.GRID_COLUMNS * Config.GRID_SIZE), (Config.GRID_ROWS * Config.GRID_SIZE) + 1);
        field.setColor(Color.WHITE);
        field.fill();

        createGrid();
        createCells();

    }

    public void createGrid() {


        int cols = grid[0].length;
        int rows = grid.length;


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                gridSquares[i][j] = new Rectangle(GridColToX(j), GridRowToY(i), Config.GRID_SIZE, Config.GRID_SIZE);
                gridSquares[i][j].setColor(Color.BLACK);
                gridSquares[i][j].draw();

            }
        }

    }

    public void createCells() {

        int cols = grid[0].length;
        int rows = grid.length;


        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                cells[i][j] = new Rectangle(cellsColToX(j),
                        cellsRowToY(i),
                        Config.GRID_SIZE - Config.GRID_SPACING,
                        Config.GRID_SIZE - Config.GRID_SPACING);
                cells[i][j].setColor(ColorEnum.values()[grid[i][j]].getColor());
                cells[i][j].fill();

            }
        }

    }

    public void initCursor(Cursor c) {


        cursorCol = (int) Math.ceil(grid[0].length / 2);
        cursorRow = (int) Math.ceil(grid.length / 2);

        int posX = cellsColToX(cursorCol);
        int posY = cellsRowToY(cursorRow);
        int width = Config.GRID_SIZE - Config.GRID_SPACING;
        int height = Config.GRID_SIZE - Config.GRID_SPACING;

        cursorShape = new Rectangle(posX, posY, width, height);
        cursorShape.setColor(Color.GRAY);
        cursorShape.fill();

        cursor = c;//new Cursor(this);

    }

    public void move(Direction direction) {

        int newCursorCol = cursorCol + direction.getDirCol();
        int newCursorRow = cursorRow + direction.getDirRow();
        int dx, dy;

        if (isOutsideBorder(newCursorCol, newCursorRow)) {

            if (newCursorCol < 0) {

                newCursorCol = grid[0].length - 1;

            } else if (newCursorCol >= grid[0].length) {

                newCursorCol = 0;

            } else if (newCursorRow < 0) {

                newCursorRow = grid.length - 1;

            } else if (newCursorRow >= grid.length) {

                newCursorRow = 0;

            }
        }

        dx = cellsColToX(newCursorCol) - cellsColToX(cursorCol);
        dy = cellsRowToY(newCursorRow) - cellsRowToY(cursorRow);

        cursorShape.translate(dx, dy);

        cursorCol = newCursorCol;
        cursorRow = newCursorRow;
    }

    public void changeColor(ColorEnum colorEnum) {
        cells[cursorRow][cursorCol].setColor(colorEnum.getColor());
        grid[cursorRow][cursorCol] = colorEnum.ordinal();
    }

    public boolean isOutsideBorder(int col, int row) {
        return col < 0 || row < 0 || col >= grid[0].length || row >= grid.length;
    }


}
