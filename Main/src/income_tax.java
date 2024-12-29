//Write a program that calculates income tax based on the
//following:
//Income ≤ ₹2,50,000: No tax.
//₹2,50,001–₹5,00,000: 5%.
//₹5,00,001–₹10,00,000: 20%.
//Above ₹10,00,000: 30%.
//Additionally, if the income is above ₹10,00,000, add a
//surcharge of 10%.

import java.util.Scanner;

class nirmala{
    public static void seetaraman(int income){
        if(income<=2_50_000){
            System.out.println("You don't need to pay any tax");
        } else if (income>2_50_000 && income<=5_00_000) {
            System.out.println("You need to pay an tax amount of: Rs. " + (income/100)*5 + " . " );
        }else if(income>5_00_000 && income<=10_00_000){
            System.out.println("You need to pay an tax amount of: Rs. " + (income/100)*20 + " . ");
        } else if (income>10_00_000) {
            System.out.println("You need to pay an tax amount of: Rs. " + (income/100)*30 + ". And an additional surcharge of: " + (income/100)*10);
        }
    }
}


public class income_tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();
        nirmala.seetaraman(salary);
    }
}
