package Strings;
import java.util.Scanner;

/*
    Given a string, return a new string made of every other char starting with the first, so "Hello"
    yields "Hlo".

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"

 */
public class stringbits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String out = "";
        for(int i = 0 ; i<str.length(); i+=2){
            out+=str.charAt(i);
        }
        System.out.println(out);
    }
}
