package Strings;
import java.util.*;

/*

Write a program that will take one string as input.
The program will then remove vowels a, e, i, o, and u (in lower or upper case ) from the string.
If there are two or more vowels that occur together then the program shall ignore all of those
vowels.

Example 1

    Input:  Cat
    Output:  Ct

Example 2

    Input:  Compuuter
    Output: Cmpuutr

 */
public class Remove_Vowel_hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String sLower = s.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sLower.length(); i++) {
            char ch = sLower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = sLower.charAt(i);
            char origCh = s.charAt(i);
            if (map.containsKey(ch)) {
                if (map.get(ch) == 1) {
                    continue;
                }
            }
            result.append(origCh);
        }

        System.out.println(result.toString());
    }
}
