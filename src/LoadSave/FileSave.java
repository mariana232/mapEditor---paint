package LoadSave;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by JSouza on 24/02/16 Academia de Codigo.
 */
public class FileSave {
    File fl;
    FileWriter fw;


    public FileSave(String file) {
        fl = new File(file);
    }

    /**
     * Saves the state of each cell in a file
     *
     */
    public void save(Integer[][] rowsAndCols) {


        if (fl.exists()) {
            fl.delete();
        }

        try {
            fw = new FileWriter(fl, true);

            for (int i = 0; i < rowsAndCols.length ; i++) {

                String s = "";
                for (int j = 0; j < rowsAndCols[i].length ; j++) {

                    s = s + rowsAndCols[i][j] + " ";
                }

                s = s + "\n";
                fw.write(s);

            }

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
