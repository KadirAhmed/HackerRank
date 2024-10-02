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

 public class MaximizeOr {

    /*
     * Complete the 'maximizingXor' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER r
     */

    public static int xor( int i, int j){
        return i ^ j;
    }
    public static int maximizingXor(int l, int r) {
        // Write your code here
        int max=0;

        for(int i =l; i<=r; i++){

            for(int j =i; j<=r; j++){
                int xor = xor(i, j);
                if(xor > max){
                    max = xor;
                }
            }

        }
        return max;
    }

}