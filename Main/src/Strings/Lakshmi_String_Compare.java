package Strings;
/*
Given two strings, s1 and s2, perform the following operations to calculate a score:
    For each character that matches at the same position in both strings, add 2 to the score.

    After all such matches are counted (and those positions are used up), for each character
    that exists in both strings but at different positions (and hasn't already been matched in
    step 1), add 1 to the score for each such match.

    Each character in each string can only contribute to the score once (either in step 1 or step 2).
    When comparing for step 1, consider only up to the length of the shorter string. For step 2,
    consider all remaining unmatched characters in both strings, even if their lengths differ.

Examples:

    Input: s1 = "bhuvana", s2 = "lavanya"
    Output: 5

    Input: s1 = "yamnsa", s2 = "bxnmia"
    Output: 4

    Input: s1 = "abcba", s2 = "ababb"
    Output: 7
*/

public class Lakshmi_String_Compare {
    public static void main(String[] args) {
        String s1 = "bhuvana";
        String s2 = "lavanya";
        int n1 = s1.length();
        int n2 = s2.length();
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        int count = 0;

        if (n1 == n2) {
            for (int i = 0; i < n1; i++) {
                if (sb1.charAt(i) == sb2.charAt(i)) {
                    count += 2;
                    sb1.deleteCharAt(i);
                    sb2.deleteCharAt(i);
                }
            }
            for (int i = 0; i < sb1.length(); i++) {
                for (int j = 0; j <sb2.length() ; j++) {
                    if(i==j){
                        continue;
                    }
                    else if (sb1.charAt(i) == sb2.charAt(j)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
