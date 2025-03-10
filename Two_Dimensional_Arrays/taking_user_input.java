package Two_Dimensional_Arrays;
import java.util.Scanner;

public class taking_user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows you want: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns you want: ");
        int columns = scanner.nextInt();
        int[][] a = new int[rows][columns];
        System.out.println("Enter values: ");
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println();

        for(int i = 0 ; i<a.length ; i++){
            for (int j = 0; j < a.length ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
