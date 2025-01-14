//Write a program to calculate the parking fee based on the
//duration of parking:
//First 2 hours: ₹20/hour.
//3–5 hours: ₹30/hour.
//More than 5 hours: ₹50/hour.
//If the total fee exceeds ₹300, give a 10% discount.

package Problem_Statements;
import java.util.Scanner;

class calc_parking{
    public static void fee(int hrs){
        if(hrs>0 && hrs<=2){
            int amt = hrs*20;
            System.out.println("Your Fee is: " + amt);

        } else if (hrs>2 && hrs<=5) { //3 hrs
            int remaining1 = hrs-2; //1hrs
            int amt1 = (hrs-remaining1)*20; //(3-1)*20 = 2*20 = 40
            int amt2 = remaining1*30; //1*30 = 30
            int total = amt1+amt2;
            System.out.println("Your Fee is: " + total);

        }else { //8
            int remaining1 = hrs-2; //8-2 = 6hrs
            int remaining2 = remaining1-3; //6 - 3 = 3hrs
            int amt1 = (hrs-remaining1)*20; //(8-6)*20 = 2*20
            int amt2 = (remaining1-remaining2)*30; //(6-3)*30 = 3*30
            int amt3 = remaining2*50;
            int total = amt1+amt2+amt3;

            if (total>300){
                System.out.println("Your Fee is: " + total);
                System.out.println("An Discount of: " + (total/100)*10 + " is Applied !");
                System.out.println("Your Final Fee is: " + (total - (total*10)/100));

            }else{
                System.out.println("Your fee is: " + total);
            }
        }
    }
}

public class parking_fee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Parking Duration(in hrs): ");
        int user = scanner.nextInt();
        calc_parking.fee(user);
        scanner.close();
    }
}
