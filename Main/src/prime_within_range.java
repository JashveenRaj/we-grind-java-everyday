import java.util.Scanner;

public class prime_within_range {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a start range: ");
        int start = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a end range: ");
        int end = scanner.nextInt();
        scanner.nextLine();

        for (int i = start; i <= end; i++) {
            for (int j = start; j <=end ; j++) {
                if (i==1){
                    continue;
                }else if (i%j==0){
                    continue;
                }else {
                    System.out.println(i);
                }

            }
        }
    }
}