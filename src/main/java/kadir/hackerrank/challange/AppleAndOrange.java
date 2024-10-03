package kadir.hackerrank.challange;
import java.util.*;


public class AppleAndOrange {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples,
                                             List<Integer> oranges) {
        // Write your code here
        int apple =  0;
        int orange = 0;

        for( int i = 0; i < apples.size(); i++)
        {
            int applePosition = a + apples.get(i);
            if( applePosition >= s && applePosition <= t ){
                apple += 1;
            }
        }

        for( int i = 0; i < oranges.size(); i++)
        {
            int  orangesPosition = b + oranges.get(i);
            if( orangesPosition >= s && orangesPosition <= t ){
                orange += 1;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }

}
