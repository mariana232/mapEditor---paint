/**
 * Created by codecadet on 25/02/16.
 */
public final class Config {



    //FILE ACCESS
    protected static final String FILE_RESOURCES_PATH = "resources/";

    //GRID DEFINITIONS
    protected static final int GRID_ROWS = 25;
    protected static final int GRID_COLUMNS = 25;
    protected static final int GRID_SIZE = 20;
    protected static final int GRID_SPACING = 1;

    //CORRECTIONS
    protected static  int X_AXIS_CORRECTION = 2;
    protected static  int Y_AXIS_CORRECTION = 26;

    //REPRESENTATION
    protected static final int BORDER_X = 0;
    protected static final int BORDER_Y = 0;




    public static void init(){

        //Set X & Y Axis according to the system OS
        if(System.getProperty("os.name").equals("Windows 10")){ //windows 10
            X_AXIS_CORRECTION = 8;
            Y_AXIS_CORRECTION = 31;

        }else if(System.getProperty("os.name").equals("Mac Os X")){ //Mac OS X
            X_AXIS_CORRECTION = 2;
            Y_AXIS_CORRECTION = 26;
        }
        else {
            //Missing other systems configuration
        }



    }



}
