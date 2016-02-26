package LoadSave;


/**
 * Created by JSouza on 24/02/16 Academia de Codigo.
 */
public class MainJSouza {

    public static void main(String[] args) {

        int[][] rows = new int[10][10];


        for (int i = 0; i < rows.length ; i++) {


            for (int j = 0; j < rows[i].length ; j++) {

                rows[i][j] = (((int) (Math.random() * (9))));
            }



        }

        FileSave fs = new FileSave("resources/myMap.txt");
        fs.save(rows);




        FileLoad fl = new FileLoad("resources/myMap.txt");
        int[][]  mm = fl.load();





        String s = "";
        for (int i = 0; i < mm.length ; i++) {

            for (int j = 0; j < mm[i].length ; j++) {
                System.out.print(mm[i][j] + " ");

            }
            System.out.println("");


        }




    }
}


