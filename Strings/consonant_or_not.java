package Strings;
import java.util.Scanner;

public class consonant_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char o = Character.toLowerCase(a);
            if(o == 'a' || o== 'e' || o == 'i' || o == 'o' || o == 'u'){
                System.out.println("Its a vowel");
            }else{
                System.out.println("Its a Consonant");
        }
    }
}
