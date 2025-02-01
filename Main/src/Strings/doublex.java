package Strings;
import java.util.Scanner;
/*
    Given a string, return true if the first instance of "x" in the string is immediately followed by
    another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true

 */

public class doublex {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        String str = scanner.nextLine();
        char[] c = str.toCharArray();
        for(int i = 0 ; i<c.length ; i++){
            for(int j = i+1 ; j<c.length ; j++){
                if(c[i] == 'x' && c[i] == c[j]){
                    System.out.println("true");
                }else if(c[i] == 'x' && c[i] != c[j]){
                    System.out.println("false");
                }
            }
        }
        System.out.println("false");
    }
}
