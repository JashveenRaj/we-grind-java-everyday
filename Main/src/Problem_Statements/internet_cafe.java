//Write a program to calculate the bill for using an internet café:
//First hour: ₹50.
//2–5 hours: ₹40/hour.
//Beyond 5 hours: ₹30/hour.
//Add a 5% surcharge for weekend usage.
package Problem_Statements;
import java.util.Scanner;

class is{
    public static boolean weekend(String day){
        return day.equals("6") || day.equals("7");
    }
}

class calcinternet{
    public static int bill(int hrs, boolean day){

            int total;
            if(hrs<=1){
                total = hrs*50;

            } else if (hrs<=5) {
                int remaining = hrs - 1;
                int amt1 = (hrs-remaining)*50;
                int amt2 = remaining*40;
                total = amt1+amt2;

            }else{
                int remaining1 = hrs-1; //5
                int remaining2 = remaining1-3; //2
                int amt1 = (hrs-remaining1)*50;
                int amt2 = (remaining1-remaining2)*40;
                int amt3 = remaining2*30;
                total = amt1+amt2+amt3;
            }

            if (day) {
                total += (total*5)/100;
            }
                return total;
    }
}

public class internet_cafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Monday");
        System.out.println("2.Tuesday");
        System.out.println("3.Wednesday");
        System.out.println("4.Thursday");
        System.out.println("5.Friday");
        System.out.println("6.Saturday");
        System.out.println("7.Sunday");
        System.out.print("Enter the day: ");

        String user_day = scanner.nextLine();
        System.out.print("Enter No of Hrs Used: ");
        int user_usage = scanner.nextInt();

        boolean day = is.weekend(user_day);
        int bill = calcinternet.bill(user_usage,day);
        System.out.println("Your bill is: " + bill);
    }
}
