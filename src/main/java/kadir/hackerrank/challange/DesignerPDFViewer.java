package kadir.hackerrank.challange;

import java.util.*;

public class DesignerPDFViewer {
    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */
    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        char letters[] =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
                's','t','u','v','w','x','y','z'};
        int wordLength = word.length();
        int maxHeight =  h.get(Arrays.binarySearch(letters, word.charAt(0)));
        for( int i = 0; i< wordLength; i++){
            char ch = word.charAt(i);
            int height = h.get(Arrays.binarySearch(letters, word.charAt(i)));
            if( height > maxHeight){
                maxHeight = height;
            }
        }
        return wordLength * maxHeight;
    }
}