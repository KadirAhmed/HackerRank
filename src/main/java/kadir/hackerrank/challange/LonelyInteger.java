package kadir.hackerrank.challange;

import java.util.*;


public class LonelyInteger {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        int lonely=0;
        for(int i: a){
            lonely ^=i;
        }
        return lonely;
    }
}