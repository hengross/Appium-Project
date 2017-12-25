package applications.vaadhorim.scenarios;

import java.io.File;
//import java.io.FileWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Creates a file with all running details.
        1. time of action
        2. type of action (text post/picture post)
        3. content of post (if text- the text we posted /if picture- path and name of picture)
 */

public class saveRunningData {

    //public static int numOfFile;
    DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
    Date dateNow = new Date();
    String timeToPost = dateFormat.format(dateNow);
    /*
        opening file to write running data inside.
        create all headlines for data from this running
     */
    public saveRunningData(){
        //numOfFile ++;
//        File root = new File("C:\\Users\\Amit\\Desktop\\metaData");
//        File writer = new File(root, "runningData" + numOfFile + ".csv");
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\Amit\\Desktop\\metaData\\runningData" + timeToPost + ".csv" , false);
            writer.append("time");
            writer.append(",");
            writer.append("action type");
            writer.append(",");
            writer.append("action content");
            //writer.append(",");
            writer.append("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // add data to existing csv file in a new row.
    public void addRow(String time, String type, String content){
        FileWriter writer ;
        try {
            writer = new FileWriter("C:\\Users\\Amit\\Desktop\\metaData\\runningData" + timeToPost + ".csv" , true);
            writer.append(time);
            writer.append(",");
            writer.append(type);
            writer.append(",");
            writer.append(content);
            //writer.append(",");
            writer.append("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
