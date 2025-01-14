package Traditional_problems;

import java.util.Scanner;

//Input: 123456
//Output: 214365


public class inverting_ones_places {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int rev =0;
        int rev1 = 0;

        while(n>0){
            int rem = n%10;
            rev = (rev*10)+rem;
            n/=10;
        }

        while(rev>0){
            int rem = rev %100;
            rev1= (rev1*100)+rem;
            rev/=100;
        }

        System.out.println("Switched Number: " + rev1);
    }
}
