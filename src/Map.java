import LoadSave.FileLoad;
import LoadSave.FileSave;
import org.academiadecodigo.simplegraphics.graphics.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by codecadet on 25/02/16.
 */
public class Map {


    private int[][] grid;
    private Representation r;
    private Cursor c;

    public Map(Representation r, Cursor c) {

        this.r = r;
        this.c = c;

    }


    public void loadMap(int[][] mapGrid) {

        this.grid = mapGrid;

        r.initRepresentation(mapGrid);
        r.createCanvas();
        r.initCursor(c);

    }


}
