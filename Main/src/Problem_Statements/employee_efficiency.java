package Problem_Statements;
import java.util.Scanner;

class calculate{
    public static void efficiency(String n , double wt){
        if (wt>=2 && wt<=3){
            System.out.println("laks " + n + ". your efficiency is high. Continue your work");
        } else if (wt>3 && wt<=4 ) {
            System.out.println("laks " + n + ". Kindly, Improve your efficiency");
        } else if (wt>4 && wt<=5) {
            System.out.println("laks " + n + ". You're assigned for our employee training programme");
        }else{
            System.out.println("laks " + n + ". Just leave the company bro");
        }
    }
}


public class employee_efficiency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter time you've taken to complete the assigned task: ");
        double work_time = scanner.nextDouble();
        scanner.nextLine();

        calculate.efficiency(name , work_time);
        scanner.close();
    }
}
