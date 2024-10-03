package kadir.hackerrank.challange;

import java.util.List;

public class CircularRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        int position;
        int count = 0;
        int  rotation = k >= a.size() ? k % a.size() : k;

        for(int x: queries){
            position =  (x - rotation );
            position = position <0 ? position + a.size() :  position ;
            queries.set(count, a.get(position));
            count++;
        }
        return queries;
    }
}
