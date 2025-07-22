package Strings;
import java.util.*;

class Solution2 {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        //abcabca
        for(int right = 0 ; right< s.length(); right++){
            char c = s.charAt(right);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            int currLength = right-left+1;
            maxLength = Math.max(maxLength , currLength);
        }
        return maxLength;
    }
}

public class Longest_Substring_without_Repeating_Characters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Solution2.lengthOfLongestSubstring(scanner.nextLine()));
    }
}
