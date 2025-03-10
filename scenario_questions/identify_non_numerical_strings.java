package scenario_questions;
import java.util.Arrays;
import java.util.Scanner;

public class identify_non_numerical_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] strings = new String[size];
        scanner.nextLine();

        for(int i = 0 ; i<size ; i++){
            strings[i]  = scanner.nextLine();
        }

        for(int i  = 0 ; i<size ; i++){
            for (int j = 0; j < 10; j++) {
                if(strings[i].contains(""+j)){
                    System.out.println(strings[i]);
                }
            }
        }
    }
}
