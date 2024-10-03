package kadir.hackerrank.challange;

public class Restaurant  {

    /*
     * Complete the 'restaurant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER l
     *  2. INTEGER b
     */

    public static int getGCD(int m, int n) {
        int gcd = 1;
        for (int i = 1; i <= m && i <= n; i++) {
            if (m % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static int restaurant(int l, int b) {
        // Write your code here
        int gcd = getGCD(l, b);
        return  l * b / (gcd*gcd);
    }
}