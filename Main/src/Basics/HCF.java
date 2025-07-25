package Basics;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hcf = 0 ;
        for (int i = 1; i <= a || i<=b ; i++) {
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.println("HCF: " + hcf);
    }
}
