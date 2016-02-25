package LoadSave;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by JSouza on 24/02/16 Academia de Codigo.
 */
public class MainJSouza {

    public static void main(String[] args) {

        List<List<Integer>> rows = new ArrayList<List<Integer>>();


        for (int i = 0; i < 25; i++) {

            List<Integer> row = new ArrayList<Integer>();

            for (int j = 0; j < 25; j++) {

                row.add(((int) (Math.random() * (9))));
            }

            rows.add(row);

        }

/*

        FileSave fs = new FileSave("resources/myMap.txt");
        fs.save(rows);

*/

        FileLoad fl = new FileLoad();

        List<List<Integer>> rowsLoad = fl.load();


        Iterator<List<Integer>> iteratorRows = rowsLoad.iterator();

        while (iteratorRows.hasNext()) {

            List<Integer> row = iteratorRows.next();

            String s = "";

            Iterator<Integer> iteratorRow = row.iterator();

            while (iteratorRow.hasNext()) {

                s = s + iteratorRow.next() + " ";
            }


        }
    }
}


