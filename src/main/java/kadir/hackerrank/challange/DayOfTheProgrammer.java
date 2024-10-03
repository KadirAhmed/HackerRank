package kadir.hackerrank.challange;


public class DayOfTheProgrammer{

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static boolean isLeapYear(int year){
        if( year % 100 == 0 && year % 400 == 0 ){
            return true;
        }
        else if( year % 4 == 0  ){
            return true;
        }
        else{
            return false;
        }
    }

    static String solve(int year){
        String date = "";
        if(year < 1918) {
            date += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
        } else if(year == 1918) {
            date += "26.09." + year;
        } else {
            date += ((year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
        }
        return date;
    }


    public static String dayOfProgrammer(int year) {
        // Write your code here
        return solve(year);
    }
}