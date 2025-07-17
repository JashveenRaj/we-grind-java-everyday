package scenario_questions;
import java.util.Scanner;

public class ban_the_guy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] banned_words = {"nigga", "chigga", "ugly","hate"};
        boolean ban = false;

        for(int i = 0 ; i<banned_words.length ; i++){
            if(s.toLowerCase().contains(""+banned_words[i])){
                ban = true;
            }
        }

        if(ban){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}