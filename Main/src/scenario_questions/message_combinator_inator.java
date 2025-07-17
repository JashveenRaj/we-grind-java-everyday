package scenario_questions;

import java.util.Scanner;

public class message_combinator_inator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] strings = new String[size];
        scanner.nextLine();

        for(int i = 0 ; i<size ; i++){
            strings[i] = scanner.nextLine();
        }

        String s = "";
        for(String string : strings){
            s+=string+" ";
        }
        System.out.println(s.trim());

        /*
        * String[] s = {"java" , "is" , "good"}
        * String out = String.join(" " , a);
        * System.out.println(out);
        */
    }
}
