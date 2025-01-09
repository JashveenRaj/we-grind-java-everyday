import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int num = scanner.nextInt();
        int result = 0;

        while(num>0){
            int rem = num%10;
            result=(result*10)+rem;
            num=num/10;
        }
        System.out.println(result);
    }
}
