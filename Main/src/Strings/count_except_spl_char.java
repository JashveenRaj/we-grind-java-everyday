package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class count_except_spl_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().toLowerCase();
        char[] chars = s.toCharArray();

        int vowels = 0;
        int counts = 0;

        for(char i : chars){
            for(char j = 'a' ; j<'z'; j++){
                if(i=='a' || i=='e' || i=='i'|| i=='o' || i=='u') {
                    vowels++;
                    break;
                }else{
                    counts++;
                    break;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonents: " + counts);
    }
}
