package kadir.hackerrank.challange;
import java.util.*;

public class BirthDayCakeCandle {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Object[] heights = new Object[candles.size()];
        heights =  candles.toArray();
        Arrays.sort(heights);
        int tallest = (int)heights[candles.size()-1];
        int total = 0;
        for(int i = candles.size()-1; i>=0; i--){
            if((int)heights[i] == tallest){
                total += 1;
            }
            else break;
        }
        return total;
    }
}