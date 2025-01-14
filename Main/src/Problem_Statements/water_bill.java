//Write a program to calculate the water bill:
//For the first 50 liters: ₹2/liter.
//        For 51–150 liters: ₹5/liter.
//        Above 150 liters: ₹8/liter.
//Add a late payment surcharge of 10% if the bill exceeds ₹800.
package Problem_Statements;
import java.util.Scanner;

class calcwater{
    public static void bill(int liter){
        if(liter>=0 && liter<=50){ //50
            int amt = liter*2; //50*2
            System.out.println("Your Bill is: " + amt);

        } else if (liter>50 && liter<=150) { //150
            int remaining = liter - 50; //100
            int amt1 = (liter-remaining)*2; // (150-100)*2 = 50*2
            int amt2 = remaining*5; //100*5
            System.out.println("Your Bill is: " + amt1+amt2);

        } else{ //280 = 50 + 100 + 130(remaining)
            int remaining1 = liter-50; //280-50 = 230
            int remaining2 = remaining1 - 100; //230-100 = 130
            int amt1 = (liter - remaining1) * 2; //280-230 = 50*2
            int amt2 = (remaining1-remaining2) * 5; //230-130*5 = 100*5
            int amt3 = remaining2*8; // 130*8
            int total = amt1+amt2+amt3;

            if (total<800){
                System.out.println(total); //no 10% surcharge for amt less than 800
            }else{
                System.out.println("Your Bill is: " + total + ((total*10)/100)); //10% surcharge for amt more than 800.
            }

        }
    }
}

public class water_bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No of Liters Used: ");
        int user = scanner.nextInt();
        calcwater.bill(user);
        scanner.close();
    }
}
