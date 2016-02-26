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

        //r = new Representation();
        this.r = r;
        this.c = c;


    }


    public void loadMap(int[][] mapGrid) {

        this.grid = mapGrid;

        r.initRepresentation(mapGrid);
        r.createCanvas();
        r.initCursor(c);

    }

/*

    private void loadMenu() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                Menu mainMenu = new Menu();
                mainMenu.createAndShowGUI();
            }
        });
    }


    private class Menu extends JPanel implements ActionListener {

        static private final String newline = "\n";

        JButton openButton, saveButton, newButton;

        JFileChooser fc;

        public Menu() {
            super(new BorderLayout());

            //Create a file chooser
            fc = new JFileChooser();

            //Default file selection is FILES_ONLY, uncomment 1 of next lines to change default
            //fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            //fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

            //Create the open button.  We use the image from the JLF
            //Graphics Repository (but we extracted it from the jar).
            openButton = new JButton("Open",
                    createImageIcon("resources/fileOpen.jpg"));
            openButton.addActionListener(this);

            //Create the save button.  We use the image from the JLF
            //Graphics Repository (but we extracted it from the jar).
            saveButton = new JButton("Save",
                    createImageIcon("/resources/fileSave.png"));
            saveButton.addActionListener(this);

            newButton = new JButton("New",
                    createImageIcon("/resources/fileNew.png"));
            newButton.addActionListener(this);


            //For layout purposes, put the buttons in a separate panel
            JPanel buttonPanel = new JPanel(); //use FlowLayout
            buttonPanel.add(openButton, 0);
            buttonPanel.add(saveButton, 1);
            buttonPanel.add(newButton, 2);

            //Add the buttons and the log to this panel.
            add(buttonPanel, BorderLayout.PAGE_START);


        }

        public void actionPerformed(ActionEvent e) {

            //Handle open button action. ====================================
            if (e.getSource() == openButton) {
                int returnVal = fc.showOpenDialog(Menu.this);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();


                    FileLoad fl = new FileLoad(file.getPath());
                    grid = fl.load();
                    loadMap(grid);

                }


                //Handle save button action.====================================
            } else if (e.getSource() == saveButton) {
                int returnVal = fc.showSaveDialog(Menu.this);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();

                    FileSave fs = new FileSave(file.getPath());
                    fs.save(grid);
                }


                //Handle new button action.====================================
            } else if (e.getSource() == newButton) {
                grid = new int[Config.GRID_ROWS][Config.GRID_COLUMNS];
                loadMap(grid);


                //log.append("creating new Map");
            }


        }

        *//**
     * Returns an ImageIcon, or null if the path was invalid.
     *//*
        protected ImageIcon createImageIcon(String path) {
            java.net.URL imgURL = Menu.class.getResource(path);


            if (imgURL != null) {
                return new ImageIcon(imgURL);
            } else {
                System.err.println("Couldn't find file: " + path);

                return null;
            }
        }

        *//**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     *//*
        private void createAndShowGUI() {
            //Create and set up the window.
            JFrame frame = new JFrame("Map Editor");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Add content to the window.
            frame.add(new Menu());

            //Display the window.
            frame.pack();
            frame.setVisible(true);
        }


    }
*/

}
