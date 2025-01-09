import java.util.Scanner;

class find{
    public static void fine(int late){
        double amt1, amt2, amt3;

       if(late>=1 && late<=5){
           amt1 = late*0.5;
           System.out.println("Your amt is: " + amt1);

       }else if(late>=6 && late<=10){
           amt1 = 5*0.5;
           int rem_days = late-5;
           amt2 = amt1 + (rem_days);
           System.out.println("Your fine amt is: " + amt2);

       }else if(late>10 && late<=30){
           amt1 = 5*0.5;
           amt2 = 5*1.0;
           int remdays3 = late-10;
           amt3 = amt1 + amt2 + (remdays3*5);
           System.out.println("Your fine is: " + amt3);

       }else{
           System.out.println("Your membership is cancelled.");
       }

    }
}

public class fine_for_knowledge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of days you had the book: ");
        int n = scanner.nextInt();
        find.fine(n);
    }
}
