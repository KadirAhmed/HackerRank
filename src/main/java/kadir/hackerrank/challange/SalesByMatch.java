package kadir.hackerrank.challange;

import java.util.*;

public class SalesByMatch{

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Integer[] color = new Integer[ar.size()];
        color = ar.toArray(color);
        Arrays.sort(color);

        int pair = 0;
        try{
            for(int i=0; i<ar.size()-1; i++){
                if( color[i] == color[i+1] ){
                    pair += 1;
                    i = i+1;
                }
            }
        }
        catch(Exception ex){
        }
        System.out.println( pair/2);
        return pair ;
    }
}