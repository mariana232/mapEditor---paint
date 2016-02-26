package LoadSave;

import java.io.*;

/**
 * Created by JSouza on 25/02/16 Academia de Codigo.
 */
public class FileLoad {
    File fl;
    int numberCol = 0;
    int numberRow = 0;
    int[][] rowsAndCols;


    public FileLoad(String file) {
        fl = new File(file);
    }


    public int[][] load() {
        int col = 0;

        if (!fl.exists()) {
            System.out.println("File not exist!");
            return null;
        }

        try {
            String s = "";

            initArray();

            FileReader fw2 = new FileReader(fl);
            BufferedReader bw2 = new BufferedReader(fw2);
            while ((s = bw2.readLine()) != null) {

                loadFile(s, col);
                col++;
            }
            bw2.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not exist! 2");

        } catch (IOException e) {

            e.printStackTrace();
        }

        return rowsAndCols;
    }


    private void loadFile(String s, int col) {
        String[] str = s.split(" ");


        try {

            for (int j = 0; j < rowsAndCols.length; j++) {

                rowsAndCols[col][j] = Integer.parseInt(str[j]);
            }
            System.out.print("");
        } catch (NumberFormatException e) {
            System.out.println("File with invalid characters.");
            //System.exit(0);

        }


    }

    private void initArray() {


        try {
            String s;
            FileReader fw = new FileReader(fl);
            BufferedReader bw = new BufferedReader(fw);
            while (( s = bw.readLine()) != null) {

                numberCol = s.split(" ").length;
                numberRow++;
            }
            bw.close();

            rowsAndCols = new int[numberCol][numberRow];

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
