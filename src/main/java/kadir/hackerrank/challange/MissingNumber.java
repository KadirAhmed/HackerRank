package kadir.hackerrank.challange;

import java.io.*;

import java.util.*;

import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        HashSet hashSet = new LinkedHashSet(brr);

        List<Integer> result = new ArrayList<>();
        for (Object i : hashSet) {
            Integer val = number((Integer)i, arr, brr);
            if(val.intValue() !=0 ){
                result.add(val);
            }
        }

        Integer[] res = result.toArray(new Integer[0]);
        Arrays.sort(res);
        result.clear();
        result.addAll(Arrays.asList(res));
        return result;
    }
    private static Integer number (Integer i, List<Integer> arr, List<Integer> brr){
        int prevSize = arr.size();
        arr.removeIf(integer ->(integer.intValue() == i.intValue()) );
        int countA = prevSize - arr.size();
        prevSize = brr.size();
        brr.removeIf(integer ->(integer.intValue() == i.intValue()) );
        int countB = prevSize - brr.size();
        if(countB > countA){
            return i;
        }
        return 0;
    }


}

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
