import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by Mariana on 25/02/16.
 */
public class Main {


    public static void main(String[] args) {





        //Load existing map from file
        //String filePath = "/Users/codecadet/Desktop/mapTest.txt";
        //Map map = new Map(filePath);


        //check Main arguments and choose to start an empty map or not
        if(args.length == 0){
            Map map = new Map();
        }else{
            Map map = new Map(args[0]);
        }


    }




}
