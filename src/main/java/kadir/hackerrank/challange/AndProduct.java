package kadir.hackerrank.challange;



class AndProduct {

    /*
     * Complete the 'andProduct' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER a
     *  2. LONG_INTEGER b
     */

    public static long andProduct(long a, long b) {
        // Write your code here
        long and =a;
        for(long i = a+1; i<=b; i++){
            and &= i;
        }
        return and;
    }
}