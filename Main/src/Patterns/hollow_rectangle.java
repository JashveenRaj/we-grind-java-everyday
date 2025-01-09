//* * * * *
//*       *
//*       *
//*       *
//* * * * *

import java.util.Scanner;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some value : ");
        int a = scanner.nextInt();

        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=a; j++) {
                if(i==1||j==1||i==a||j==a){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
}
