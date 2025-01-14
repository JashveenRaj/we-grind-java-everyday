package Basics;

import java.util.Scanner;

class find2 {
    public static String great(int a, int b){
        if (a>b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
        return null;
    }
}

public class if_else_2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();
        String result = find2.great(a,b);
        System.out.println(result);
    }
}
