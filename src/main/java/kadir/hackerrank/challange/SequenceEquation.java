package kadir.hackerrank.challange;

import java.util.*;

public class SequenceEquation {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */
    public static List<Integer> permutationEquation(List<Integer> p) {
        // Write your code here
        List yList = new ArrayList<Integer>();

        for (int x = 0; x < p.size(); x++) {
            int index = searchIndex(x + 1, p);
            index = searchIndex(index + 1, p);
            yList.add(x, index + 1);
        }
        return yList;
    }

    public static int searchIndex(int number, List<Integer> p) {
        int index = 0;
        for (int i = 0; i < p.size(); i++) {
            if (number == p.get(i)) {
                index = i;
            }
        }
        return index;
    }
}