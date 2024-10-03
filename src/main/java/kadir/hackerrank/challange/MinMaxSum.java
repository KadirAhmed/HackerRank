package kadir.hackerrank.challange;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class MinMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */


    public static long getSum(List<Integer> arr, int remove){

        long sum =0;
        for(int i =0; i<arr.size(); i++){
            sum += arr.get(i);
        }
        return sum - remove;

    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long[] sums = new long[arr.size()];

        for(int i = 0; i < arr.size(); i++){
            sums[i] = getSum(arr, arr.get(i));
        }

        Arrays.sort(sums);
        System.out.print(sums[0]+ " " + sums[sums.length-1]);
    }

}
