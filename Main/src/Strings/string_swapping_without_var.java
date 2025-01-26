package Strings;

import java.util.Scanner;

public class string_swapping_without_var {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter second String: ");
        String s2 = scanner.nextLine();

        s1 = s1+s2; //HelloNigga
        s2=s1.substring(0,s1.length()-s2.length()); //10-5 = 5 , starting from 0 and till 5 , the substring in s1 is Hello.
        s1=s1.substring(s2.length()); //This'll print substring from starting index 5 (s2.length) till end of the s1.

        System.out.println(s1);
        System.out.println(s2);
    }
}
