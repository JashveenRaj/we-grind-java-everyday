package Arrays;
import java.util.Scanner;

public class maximum_consecutive_ones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt(); //{1,1,0,0,0,1,0,1,0,1,1,1,1}
        }

        int count = 0;
        int sol = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0){
                count=0;
            }else{
                count++;
            }
            if(count>sol){
                sol = count;
            }
        }
        System.out.println(sol);
    }
}
