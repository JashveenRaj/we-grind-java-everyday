package Traditional_problems;//import java.util.Scanner;
//
//public class swapping_threevar_without_temp {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number1: ");
//        System.out.println("Enter number2: ");
//        System.out.println("Enter number3: ");
//        int a = 14; //26
//        int b = 18; //14
//        int c = 26; //18
//        System.out.println("a: " + ((a+b+c)-(a+b)));
//        System.out.println("b: " + ((a+b+c)-(b+c)));
//        System.out.println("c: " + ((a+b+c)-(c+a)));
//    }
//}
import java.util.Scanner;

public class swapping_threevar_without_temp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number2: ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number3: ");
        int c = scanner.nextInt();
        scanner.nextLine();

        System.out.println("a: " + ((a+b+c)-(a+b)));
        System.out.println("b: " + ((a+b+c)-(b+c)));
        System.out.println("c: " + ((a+b+c)-(c+a)));
    }
}
