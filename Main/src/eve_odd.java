import java.util.Scanner;

class eve_or_odd{
    public static String even_odd(int a){
        return a%2==0 ? "Even" : "Odd";
    }
}


public class eve_odd {
    public static void main(String[] args) {

        System.out.println("Enter a number to check: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        String result = eve_or_odd.even_odd(a);
        System.out.println(result);
    }
}
