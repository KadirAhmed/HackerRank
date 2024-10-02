package kadir.hackerrank.challange;


import java.util.ArrayList;
import java.util.List;

import java.util.*;


public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        ArrayList row = new ArrayList<Integer>();
        int colIndex = 0;
        int sum_left = 0;
        int sum_right = 0;

        for(int i = 0; i < arr.size(); i++){
            colIndex = i;
            row = (ArrayList)arr.get(i);
            sum_left = sum_left + (int)row.get(colIndex);

            colIndex = arr.size() - i -1;
            System.out.println((int)row.get(colIndex));
            sum_right = sum_right + (int)row.get(colIndex);
        }

        return Math.abs(sum_left - sum_right);
    }

}


