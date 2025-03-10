package Traditional_problems;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int user = scanner.nextInt();

        int i = 0;
        while(i<=10){
            System.out.println( user + " * " + i + " = " + user*i);
            i++;
        }
    }
}
