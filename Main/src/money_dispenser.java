import java.util.Scanner;

class money{
    public static void dispenser(int num){

        int amount = num;

        if(num>500) {
            int took = num / 500;
            System.out.println("No of 500 notes: " + took);
            amount %=500;
        }

       if (amount<500 && amount>=100) {
           int took2 = amount / 100;
           System.out.println("No of 100 notes: " + took2);
           amount %=100;
       }

       if (amount<100 && amount>=50) {
           int took3 = amount / 50;
           System.out.println("No of 50 notes: " + took3);
           amount %=50;
       }

       if (amount<50 && amount>=10) {
           int took4 = amount / 10;
           System.out.println("No of 10 notes: " + took4);
       }

    }
}


public class money_dispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter An Amount (note: the ones place should be 0): ");
        int user = scanner.nextInt();
        scanner.nextLine();
        money.dispenser(user);
    }
}
