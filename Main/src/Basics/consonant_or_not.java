package Basics;

import java.util.* ;

public class consonant_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a charecter: ");
        char alphabet = scanner.next().charAt(0);
        System.out.println(alphabet=='a' || alphabet== 'e' || alphabet== 'i' || alphabet== 'o' ||alphabet == 'u' ? "This is an Vowel" : "This is a consonant");
    }
}
