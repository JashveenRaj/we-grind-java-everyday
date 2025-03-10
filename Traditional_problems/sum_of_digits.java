package Traditional_problems;

import java.util.Scanner;

/* Concepts Used:
*     - num % 10 gives the last digit of any number
*     - num/10 removes the last digit of any number
*/

public class sum_of_digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.Find sum of digits");
            System.out.println("2.Exit");
            int user = scanner.nextInt();
            scanner.nextLine();

            switch(user){
                case 1:
                    System.out.println("----------------------------");
                    System.out.println("Enter an number: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    int num1 = num;

                    int sum = 0 ;

                    while(num1!=0){
                        int digit = num1%10;
                        sum += digit;
                        num1 /= 10;
                    }

                    System.out.println("Sum of digits from " + num + " is " + sum );
                    System.out.println("----------------------------");
                    break;


                case 2:
                    System.exit(0);
            }

        }

    }
}
