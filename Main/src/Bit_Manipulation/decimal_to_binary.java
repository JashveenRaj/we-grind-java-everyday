package Bit_Manipulation;
import java.util.Scanner;

class decimal{
    public static String binary(int num){
        String out = "";
        while(num!= 1){
            if(num%2==1){
                out+=1;
            }else{
                out+=0;
            }
            num/=2;
        }
        return out;
    }
}

public class decimal_to_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int user_input = scanner.nextInt();
        String result = decimal.binary(user_input);
        System.out.println("Original number: " + user_input);
        System.out.print("Binary of given number: "+ result);
    }
}
