package kadir.hackerrank.challange;

public class ViralAdvertising  {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
        // Write your code here
        double recepients = 5;
        int like = 2;
        int likeCumulative = like;

        for( int i=2; i<=n; i++){
            recepients = like * 3;
            like = (int)Math.floor(recepients/2);
            likeCumulative = like + likeCumulative;
        }
        return likeCumulative;
    }
}
