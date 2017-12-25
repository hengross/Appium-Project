package applications.vaadhorim.scenarios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Amit on 20/12/2017.
 */


/*
    Create a text file with all device and the device browser detail's. for example:
        "Start_run_in_epoch_time": 1494172203.773835,
        "OS_name": "Android",
        "OS_version": 6.0.1
        "OS architecture": "64bit",
        "Browser_name": "chrome",
        "Browser_version": "58.0.3029.81",
        "User_type": "active",
        "End_run_in_epoch_time": 1494172231.958877
 */

public class SaveDeviceData {

    //public static int numOfFile;

    public SaveDeviceData(){
        //numOfFile ++;

        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd-HH.mm.ss");
        Date dateNow = new Date();
        String timeToPost = dateFormat.format(dateNow);
        //FileWriter writer = null;
        //FileWriter writer = null;
        //PrintWriter pw ;
        //StringBuilder writer;
        String nameFile = "deviceData" + timeToPost + ".txt";
        FileWriter writer = null;

        //StringBuilder sb = new StringBuilder();
        try {
            writer = new FileWriter("C:\\Users\\Amit\\Desktop\\metaData\\" + nameFile , false);
            writer.append("Start_run_in_epoch_time: ");
            writer.append(dateFormat.format(dateNow));
            writer.append("\n");
            writer.append("OS_name: ");
            writer.append("Android");
            writer.append("\n");
            writer.append("OS_version: ");
            writer.append("4.4.2");
            writer.append("\n");
            writer.append("OS architecture: ");
            writer.append("64bit");
            writer.append("\n");
            writer.append("Browser_name: ");
            writer.append("chrome");
            writer.append("\n");
            writer.append("Browser_version: ");
            writer.append("63.0.3239");
            writer.append("\n");
            writer.append("User_type: ");
            writer.append("active");
            writer.append("\n");
            Date date2 = new Date();
            writer.append("End_run_in_epoch_time: ");
            writer.append(dateFormat.format(date2));
            writer.append("\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
