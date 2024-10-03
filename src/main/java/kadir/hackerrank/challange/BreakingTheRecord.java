package kadir.hackerrank.challange;
import java.util.*;


public class BreakingTheRecord {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int highest = (int) scores.get(0);
        int lowest = highest;
        int breakHighest = 0;
        int breakLowest = 0;

        for( int i = 1; i< scores.size(); i++){
            int score = scores.get(i);
            if( score > highest ){
                breakHighest += 1;
                highest = score;
            }
            else if( score < lowest){
                breakLowest += 1;
                lowest = score;
            }
            else{}
        }

        ArrayList breakRecord = new ArrayList<Integer>();
        breakRecord.add(breakHighest);
        breakRecord.add(breakLowest);
        return breakRecord;
    }
}