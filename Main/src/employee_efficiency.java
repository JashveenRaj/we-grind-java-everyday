import java.util.Scanner;

class calculate{
    public static void efficiency(String n , int wt){
        if (wt>=2 && wt<=3){
            System.out.println("Hello " + n + ". your efficiency is high. Continue your work");
        } else if (wt>3 && wt<=4 ) {
            System.out.println("Hello " + n + ". Kindly, Improve your efficiency");
        } else if (wt>4 && wt<=5) {
            System.out.println("Hello " + n + ". You're assigned for our employee training programme");
        }else{
            System.out.println("Hello " + n + ". Just leave the company bro");
        }
    }
}


public class employee_efficiency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter time you've taken to complete the assigned task: ");
        int work_time = scanner.nextInt();
        scanner.nextLine();

        calculate.efficiency(name , work_time);
    }
}
