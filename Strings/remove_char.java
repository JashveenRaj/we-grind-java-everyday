package Strings;
import java.util.Scanner;

public class remove_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.nextLine().toLowerCase().toCharArray();
        char c = sc.next().charAt(0);
        String out ="";
        for (int i = 0; i < s.length; i++) {
            if(s[i]!=c) {
                out += s[i];
            }
        }
        System.out.println(out);
    }
}
