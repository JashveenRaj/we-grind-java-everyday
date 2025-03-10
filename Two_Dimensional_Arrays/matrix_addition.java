package Two_Dimensional_Arrays;
import java.util.Scanner;
import java.util.Arrays;

class Matrix {
    public static int[][] addition(int[][] ar1 ,int[][] ar2){
        int[][] result = new int[ar1.length][ar1.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length ; j++) {
                result[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        return result;
    }
}

public class matrix_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Outer Array: ");
        int outer_size = sc.nextInt();
        System.out.print("Enter the size of Inner Array: ");
        int inner_size = sc.nextInt();
        int[][] a = new int[outer_size][inner_size];
        int[][] b = new int[outer_size][inner_size];

        System.out.println("Enter values for the First Array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for the Second Array: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Array 'A': ");
        for(int[] i : a){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Array 'B': ");
        for(int[] i : b){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] ans = Matrix.addition(a,b);
        System.out.println("Result: " + Arrays.deepToString(ans));

    }
}
