package Strings;
import java.util.Scanner;

/*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;

frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"

*/

public class front_times {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        String out = "";
        String out2 = "";
        if(str.length()>3){
            out = str.substring(0,3);
        }else{
            out = str;
        }
        while(n>0){
            out2+=out;
            n--;
        }
        System.out.println(out2);
    }
}
