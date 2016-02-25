package LoadSave;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by JSouza on 25/02/16 Academia de Codigo.
 */
public class FileLoad {
    File fl;
    List<List<Integer>> rows = new ArrayList<List<Integer>>();
    


    public FileLoad(String file) {
        fl = new File(file);
    }

    public List<List<Integer>> load() {


        if(!fl.exists()){
            System.out.println("File not exist!");
            return null;
        }

        FileReader fw;
        BufferedReader bw;

        try {

            fw = new FileReader(fl);
            bw = new BufferedReader(fw);

            String s = "";
            while ((s = bw.readLine()) != null) {
                loadFile(s);

            }
            bw.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not exist! 2");

        } catch (IOException e) {

            e.printStackTrace();
        }
        return rows;
    }


    private void loadFile(String s) {
        List<Integer> row = new ArrayList<Integer>();
        String[] str = s.split(" ");

        try {

            for (String ss : str) {
                row.add(Integer.parseInt(ss));
            }

        } catch (NumberFormatException e) {
            System.out.println("File with invalid characters.");
            //System.exit(0);

        }

        rows.add(row);
    }
}
