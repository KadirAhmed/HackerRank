package kadir.hackerrank.challange;

public class NumberLineJump {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        String possible = "NO";
        if (x2 > x1 && v2 >= v1) {
            possible = "NO";
        } else if (Math.abs(x2 - x1) % Math.abs(v2 - v1) == 0) {
            possible = "YES";
        } else {
        }
        return possible;
    }
}
