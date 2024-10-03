package kadir.hackerrank.challange;

import java.util.*;

public class ElectronicsShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */

        int[] bestprice = new int[keyboards.length * drives.length];
        int count = -1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                count++;
                bestprice[count] = (keyboards[i] + drives[j]) <= b ? (keyboards[i] + drives[j]) : -1;
            }
        }

        Arrays.sort(bestprice);
        return bestprice[count];
    }
}