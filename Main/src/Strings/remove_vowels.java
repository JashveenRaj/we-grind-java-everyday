package Strings;
import java.util.Scanner;

class remove{
    public static String vowel(String word){
        char[] charr = word.toLowerCase().toCharArray();
        int count = 0 ;
        for (char i : charr) {
            if( i=='a' || i =='e' || i=='i' || i=='o' || i=='u'){
                count++;
            }
        }

        char[] newarr = new char[charr.length-count];
        int index = 0 ;
        for(char i : charr){
            if(i=='a' || i =='e' || i=='i' || i=='o' || i=='u'){
                continue;
            }
            newarr[index] = i;
            index++;
        }
        return new String(newarr); // String result = new String(newarr) is reduced.
    }
}

public class remove_vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String user = scanner.nextLine();
        String output = remove.vowel(user);
        System.out.print("Output: " + output);
    }
}
