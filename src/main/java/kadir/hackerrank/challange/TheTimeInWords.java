package kadir.hackerrank.challange;

public class TheTimeInWords  {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */
    public static String timeInWords(int h, int m) {
        // Write your code here
        String times[] = { "", "one", "two", "three", "four","five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four","twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine",
        };
        if (m == 0) {
            return times[h] +" "+ "o' clock";
        }
        else if (m == 1) {
            return times[m] + " " + "minute past" + " " + times[h];
        }
        else if (1 < m && m < 15) {
            return times[m] + " " + "minutes past" + " " + times[h];
        } else if (m == 15) {
            return "quarter past " + times[h];
        } else if (m > 15 && m < 30) {
            return times[m] + " " + "minutes past" + " " + times[h];
        } else if (m == 30) {
            return "half past " + times[h];
        } else if (m > 30 && m < 45) {
            return times[60 - m] + " minutes to " + times[h + 1];
        }
        else if (m == 45) {
            return "quarter to " + times[h + 1];
        }
        else if (45 < m && m <= 58) {
            return times[60 -m] + " " + "minutes to" + " " + times[h +1];
        }

        else if ( m ==59) {
            return times[60 -m] + " " + "minute to" + " " + times[h +1];
        }
        else return "";
    }
}