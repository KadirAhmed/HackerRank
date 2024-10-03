package kadir.hackerrank.challange;

public class Staircase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static String getString(int spaceCount, int caseCount){
        String stairCase = "";
        String stairSpace= "";

        for(int i =1; i<=spaceCount; i++){
            stairSpace +=" ";
        }
        for(int i =1; i<=caseCount; i++){
            stairCase +="#";
        }
        return stairSpace+stairCase;
    }

    public static void staircase(int n) {
        // Write your code here
        for(int i = 1; i<=n; i++){
            System.out.println( getString(n - i, i));
        }
    }
}