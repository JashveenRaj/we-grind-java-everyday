package scenario_questions;
import java.util.Arrays;
import java.util.Scanner;

public class sentence_reverser_inator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = "";
        String[] strings  = s.split(" ");
        System.out.println(Arrays.toString(strings));
//        String[] strings = s.split("\\s");
        for(int i = strings.length-1 ; i>=0 ; i--){
            s1+=strings[i]+" ";
        }
        System.out.println(s1.trim());
    }
}
