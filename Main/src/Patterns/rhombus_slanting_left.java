import java.util.Scanner;

public class rhombus_slanting_left {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
            if(i==1){
            System.out.print(" ");
            }else{
            System.out.print(" ".repeat(i));
            }

        }
    }
}
