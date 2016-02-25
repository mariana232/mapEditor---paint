package LoadSave;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/**
 * Created by JSouza on 24/02/16 Academia de Codigo.
 */
public class FileSave {
    File fl;


    public FileSave(String file) {
        fl = new File(file);
    }

    /**
     * Saves the state of each cell in a file
     *
     * @param rows List with the states of the lines of each cell
     */
    public void save(List<List<Integer>> rows) {


        if (fl.exists()) {
            fl.delete();
        }

        // Iterator for List the rows
        Iterator<List<Integer>> iteratorRows = rows.iterator();

        while (iteratorRows.hasNext()) {

            //List  States for row
            List<Integer> row = iteratorRows.next();

            String s = "";

            // Iterator for row
            Iterator<Integer> iteratorRow = row.iterator();

            while (iteratorRow.hasNext()) {

                s = s + iteratorRow.next() + " ";
            }

            s = s + "\n";
            saveFile(s);
        }
    }


    private void saveFile(String s) {
        FileWriter fw;

        try {

            fw = new FileWriter(fl, true);
            fw.write(s);
            fw.close();


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }


}
