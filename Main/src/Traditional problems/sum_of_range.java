import java.util.Scanner;

public class sum_of_range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = a;
        int j = 0;
        do{
            j+=i;
            System.out.println(j);
            i++;
        }while(i<b);
    }
}
