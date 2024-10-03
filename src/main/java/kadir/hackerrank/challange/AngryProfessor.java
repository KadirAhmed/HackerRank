package kadir.hackerrank.challange;

import java.util.*;

public class AngryProfessor  {

    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int countOntime = 0;

        for(int i = 0; i<a.size(); i++ ){
            if(a.get(i)<= 0){
                countOntime ++;
            }
        }
        if(countOntime >= k){
            return "NO";
        }
        else{
            return "YES";
        }
    }
}