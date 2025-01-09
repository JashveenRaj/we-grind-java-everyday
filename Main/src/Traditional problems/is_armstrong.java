//import java.util.Scanner;
//
//public class is_armstrong {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = scanner.nextInt();
//        int to_num = num;
//        int finalnum = num;
//        int count = 0;
//        int result = 0;
//
//        while(to_num>0){
//            to_num/=10;
//            count++;
//        }
//
//        while(num>0){
//            int cuber = num%10;
//            result+= (int) Math.pow(cuber,count);
//            num/=10;
//        }
//
//        if(result==finalnum){
//            System.out.println(finalnum + " Is an Armstrong Number");
//        }else{
//            System.out.println(finalnum + " Not an Armstrong Number");
//        }
//
//    }
//}
import java.util.Scanner;

public class is_armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int to_num = num;
        int finalnum = num;
        int count = 0;
        int result = 0;

        while(to_num > 0){
            to_num /= 10;
            count++;
        }

        while(num > 0){
            int digit = num % 10;
            int digitPower = 1 ;

            for(int i = 1; i <= count; i++){
                digitPower *= digit;
            }

            result += digitPower;
            num /= 10;
        }

        if(result == finalnum){
            System.out.println(finalnum + " Is an Armstrong Number");
        } else {
            System.out.println(finalnum + " Not an Armstrong Number");
        }
    }
}
