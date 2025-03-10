package Random;
import java.util.*;

public class no_pos_change_after_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = s.length();

        int left  = 0;
        int right = length-1;

        int count = 0;
        while(left<length && right>=0){
            if(s.charAt(left) == s.charAt(right)){
                count++;
            }
                left++;
                right--;
        }
        System.out.println(count);
    }
}
