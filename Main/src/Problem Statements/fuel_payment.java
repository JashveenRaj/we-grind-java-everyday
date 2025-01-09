//Write a program to calculate the cost of fuel:
//First 5 liters: ₹100/liter.
//6–10 liters: ₹90/liter.
//Beyond 10 liters: ₹80/liter.
//Add a convenience fee of ₹50 for online payment.

import java.util.Scanner;

class calc_cash{
    public static int bill1(int petrol, int amt){
        int total;
        if(petrol>=0 && petrol<=5){
            amt = petrol*100;
            total = amt;
            return total;

        } else if (petrol<=6 && petrol<=10) {
            int remaining = petrol - 5;
            int amt1 = (petrol - remaining)*100;
            int amt2 = remaining*90;
            total = amt1+amt2;
            return total;

        } else {
            int remaining1 = petrol -5; //7
            int remaining2 = remaining1-5; //2
            int amt1 = (petrol-remaining1)*100;
            int amt2 = (remaining1-remaining2)*90;
            int amt3 = remaining2*80;
            total = amt1+amt2+amt3;
            return total;

        }
    }
}


public class fuel_payment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Liter of fuels filled: ");
        int user = scanner.nextInt();
        System.out.println("Enter payment mode: ");
        System.out.println("1. Cash");
        System.out.println("2. Online Payment");
        int pay = scanner.nextInt();
        int result = calc_cash.bill1(user, pay);
        switch(pay){
            case 1:
                System.out.println("Your bill is: " + result);
                break;
            case 2:
                System.out.println("Your bill is: " + (result+50));
                break;
        }
    }
}
