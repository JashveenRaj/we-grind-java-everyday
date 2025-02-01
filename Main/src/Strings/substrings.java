package Strings;
import java.util.Scanner;
/*
    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
 */

public class substrings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String out = "";
        for(int i = 0 ; i<str.length() ; i++){
            for(int j = 0 ; j<=i ; j++){
                out+=str.charAt(j);
            }
        }
        System.out.println(out);
    }
}
