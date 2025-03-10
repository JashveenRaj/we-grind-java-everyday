/*
 * Sum - Largest Digits
 *
 * The program must accept N integers as the input.
 * The program must print the sum of the largest digit in each integer
 * among the N integers as the output.
 *
 * Boundary Condition(s):
 *
 *     2≤N≤10002≤N≤1000
 *
 *     0≤0≤ Each integer value ≤104≤104
 *
 * Input Format:
 *
 *     The first line contains N.
 *
 *     The second line contains N integers separated by a space.
 *
 * Output Format:
 *
 *     The first line contains the sum of the largest digit in each integer among
 *      the N integers.
 *
 * Example Input/Output 1:
 *
 * Input:
 * 5
 * 87 1654 121 657 15
 *
 * Output:
 * 28
 */

package Random;

import java.util.Scanner;

public class sum_of_largeno_outof_int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        String nos = "";
        for(int i = 0 ; i <= n ; i++){
             nos += scanner.nextLine() + " ";
        }

        int sum = 0;

        String[] strings = nos.trim().split(" ");
       for(int i = 0 ; i<strings.length ; i++){
        int large = Integer.MIN_VALUE;
           int no = Integer.parseInt(strings[i]);
           while(no>0){
                int last = no%10;
                if(last>large){
                    large = last;
                }
                no=no/10;
           }
           sum+=large;
       }
        System.out.println(sum);
    }
}
