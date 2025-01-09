import java.util.Scanner;

class validate{
    public static void triangle(int a , int b, int c){
        System.out.println((a+b+c) == 180 ? "Valid triangle" : " Not Valid ");

    }
}

public class valid_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle_1 = scanner.nextInt();
        scanner.nextLine();
        int angle_2 = scanner.nextInt();
        scanner.nextLine();
        int angle_3 = scanner.nextInt();
        scanner.nextLine();

        validate.triangle(angle_1,angle_2,angle_3);
        scanner.close();
    }
}
