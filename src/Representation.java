import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by Mariana on 25/02/16.
 */
public class Representation {


    private Rectangle[][] gridSquares;
    private Rectangle[][] cells;
    private int[][] grid;

    public Representation(int[][] grid) {
        this.grid = grid;
        gridSquares = new Rectangle[Config.GRID_ROWS][Config.GRID_COLUMNS];
        cells = new Rectangle[Config.GRID_ROWS][Config.GRID_COLUMNS];
    }


    private int rowToY(int row) {
        return Config.BORDER_X + Config.GRID_SIZE * row;
    }

    private int colToX(int col) {
        return Config.BORDER_Y + Config.GRID_SIZE * col;
    }

    public void createCanvas() {
        Rectangle field = new Rectangle(Config.BORDER_X, Config.BORDER_Y, (Config.GRID_COLUMNS * Config.GRID_SIZE), (Config.GRID_ROWS * Config.GRID_SIZE)+1);
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

                gridSquares[i][j] = new Rectangle(colToX(j), rowToY(i), Config.GRID_SIZE, Config.GRID_SIZE);
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

                cells[i][j] = new Rectangle(colToX(j) + Config.GRID_SPACING,
                        rowToY(i) + Config.GRID_SPACING,
                        Config.GRID_SIZE - Config.GRID_SPACING*2,
                        Config.GRID_SIZE - Config.GRID_SPACING*2);
                cells[i][j].setColor(Color.WHITE);
                cells[i][j].fill();

            }
        }

    }



    /*

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
        return col < 0 || row < 0 || col > grid.getCols() || row > grid.getRows();
    }

    public void move(Direction direction) {
        if(!isOutsideBorder(this.getCol(), this.getRow())) {
            setCol(this.getCol() - direction.getDirCol());
            setRow(this.getRow() - direction.getDirRow());
        }
    }

   public void setColor(Color color) {
        rectangle.setColor(color);
        //rectangle.fill();
    }*/

}
