package Strings;
import java.util.Scanner;
/*
 * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 *
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 *
 */

public class returning_only_nth_character {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        String s = "";
        char[] sub = str.toCharArray();
        for(int i = 0 ; i <sub.length ; i+=n){
            s+=sub[i];
        }
        System.out.println(s);
    }
}
