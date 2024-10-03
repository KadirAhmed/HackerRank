package kadir.hackerrank.challange;


public class RepeatedString {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        int count =0;
        char[] letters = s.toCharArray();
        for(char chars:letters){
            if(chars == 'a'){
                count++;
            }
        }

        long totalA = count * (n/((Integer)letters.length));
        int remeinder = (int)((n%((Integer)letters.length)));
        if (remeinder==0) return totalA;
        else{
            count = 0;
            for(int i = remeinder-1; i>= 0; i--){
                if( letters[i]=='a'){
                    count++;
                }
            }
            return totalA + count;
        }
    }
}