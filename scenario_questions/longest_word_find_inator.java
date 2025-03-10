package scenario_questions;
import java.util.Scanner;

public class longest_word_find_inator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] strings = s.trim().split(" ");
        int length = 0;
        String out = "";
        for(String string:strings){
            if(string.length()>length){
                length = string.length();
                out = string;
            }
        }
        System.out.println(out);
    }
}
