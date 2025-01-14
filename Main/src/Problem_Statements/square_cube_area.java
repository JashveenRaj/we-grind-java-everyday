package Problem_Statements;
import java.util.Scanner;

class squaree {
    public static int sqr(int a){
        //Calculate square
        return a*a;
    }
}

class cubed{
    public static int cube(int a){
        //Calculate cube
        return a^3;
    }
}

class circle {
    public static double area(int a){
        //Calculate area
        return 3.14*(a*a);
    }
}

public class square_cube_area {
    public static void main(String[] args) {

        //Take input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        //Pass values
        int square_res = squaree.sqr(num);
        int cube_res = cubed.cube(num);
        double area_res = circle.area(num);

        //Print values
        System.out.println("Square of the number: " + square_res);
        System.out.println("Cube of the number: " + cube_res);
        System.out.println("Area of circle with radius: " + area_res);
        scanner.close();
    }
}
