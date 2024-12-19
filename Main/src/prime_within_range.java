import java.util.Scanner;

public class prime_within_range {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a start range: ");
        int start = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a end range: ");
        int end = scanner.nextInt();
        scanner.nextLine();

        for (int i = start; i <= end; i++) {
            if (i==1){
                flag = false;

            } else if (i>1) {
                for (int j = start; j <=end ; j++) {
                    if (i%j==0){
                        flag=false;
                }else {
                        flag = true;
                    }
            }
        }
            if (flag==true){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }
}