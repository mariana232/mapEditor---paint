/**
 * Created by João Romero on 25/02/16.
 */
public class Test {

    Grid grid;

    public Test (int width, int height, int cellSize) {
        grid = new Grid(cellSize, width, height);
    }

    public void init () {
        grid.init();
    }


}
