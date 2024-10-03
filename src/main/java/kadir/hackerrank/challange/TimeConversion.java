package kadir.hackerrank.challange;

import java.text.*;
import java.util.*;

public class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        DateFormat inputDateFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat outputDateFormat = new SimpleDateFormat("HH:mm:ss");
        String date ="";

        try{
            Date time = inputDateFormat.parse(s);
            date = outputDateFormat.format(time);
        }
        catch(ParseException ex){
        }
        return date;
    }
}