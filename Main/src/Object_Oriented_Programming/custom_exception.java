package Object_Oriented_Programming;
import java.util.Scanner;

class NotEligible extends RuntimeException{
    NotEligible(String msg){
        System.out.println(msg);
    }
}
public class custom_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<18){
            throw new NotEligible("Sappu");
        }
    }
}
