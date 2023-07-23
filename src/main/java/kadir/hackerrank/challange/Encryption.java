package kadir.hackerrank.challange;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
    public static String encryption(String s) {
    // Write your code here
    
        List strings = new ArrayList<String>();
        int row = (int) Math.sqrt(s.length());
        int col = row + 1;
        if (row * row == s.length()) {
            col = row;
        } else if (row * col < s.length()) {
            row += 1;
        } else {
        }
        int r, c;

        for (int i = 0; i < row; i++) {
            r = i * row;
            c = r + col;

            if (i > 0) {
                r = col * i;
                c = r + col;
            }

            if (c > s.length()) {
                c = s.length();
            }
            String string = s.substring(r, c);
            System.err.println(string);
            strings.add(string);
        }

        String encyptedMsg = "";
        String message = "";
        for (int i = 0; i < col; i++) {
            message = "";

            for (int j = 0; j < row; j++) {
                try {
                    message += strings.get(j).toString().charAt(i);
                } catch (Exception ex) {
                    continue;
                }
            }
            message += " ";
            encyptedMsg += message;
        }
     return encyptedMsg;
    }
}
