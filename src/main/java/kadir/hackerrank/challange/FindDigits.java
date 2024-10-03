package kadir.hackerrank.challange;

public class FindDigits {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int digitCount( int n){

        int count = 0;
        int original = n;
        while(n!=0) {
            int module = n%10;
            n = (int) n/10;
            if(module !=0 && original%module ==0){
                count++;
            }
        }
        return count;
    }

    public static int findDigits(int n) {
        // Write your code here
        int digitCount = digitCount( n );
        return digitCount;
    }
}
