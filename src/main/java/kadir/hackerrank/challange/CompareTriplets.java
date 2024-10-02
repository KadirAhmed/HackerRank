package kadir.hackerrank.challange;

import java.util.*;


public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aa = 0, bb = 0;
        for(int i=0 ; i<3; i++)
        {
            aa+= (int)a.get(i) > (int)b.get(i) ? 1 : 0 ;
            bb+=  (int)a.get(i) < (int)b.get(i) ? 1 : 0 ;
        }
        List<Integer> list = new ArrayList();
        list.add(aa);
        list.add(bb);

        return  list;

    }
}