package kadir.hackerrank.challange;

import java.util.*;

public class Pairs {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static Integer[] remove(final Object array, final int index) {
        final int length = ((Integer[]) (array)).length;
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
        }
        final Object result = (Object) new Integer[length-1] ;
        System.arraycopy(array, 0, result, 0, index);
        if (index < length - 1) {
            System.arraycopy(array, index + 1, result, index, length - index - 1);
        }
        return (Integer[]) result;
    }
    public static int pairs(int k, List<Integer> arr) {
        // Write your code

        int pair = 0;

        Integer[] arrays = new Integer[arr.size()];
        arrays = (Integer[]) arr.toArray(arrays);
        Arrays.sort(arrays);

        for (int integer : arrays) {
            int element = integer- k;
            int index = Arrays.binarySearch( arrays,element);
            if( index >= 0 ){
                pair +=1;
            }
        }
        return pair;
    }
}