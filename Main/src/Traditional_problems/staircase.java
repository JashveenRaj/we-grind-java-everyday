package Traditional_problems;
import java.util.*;

public class staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int curr = 1;

        int prev = 0;
        while(n>0){
            if(curr > prev){
                count++;
            }
            curr++;
            prev++;
            n-= curr;
        }
        System.out.println(count);
    }
}
