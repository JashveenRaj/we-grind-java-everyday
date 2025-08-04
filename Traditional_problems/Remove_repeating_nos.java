package Traditional_problems;
import java.util.*;

public class Remove_repeating_nos {
    public static void main(String[] args) {
        int n = 15556233; // --> 15623
        String s = Integer.toString(n);
        String result = "";
        char prev = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if(curr!=prev){
                result+=curr;
            }
            prev = curr;
        }
        System.out.println(Integer.parseInt(result));
    }
}
