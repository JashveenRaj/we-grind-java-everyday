package Two_Dimensional_Arrays;
import java.util.Arrays;

public class matrix_multiplication {
    public static void main(String[] args) {
        int[][] a = {{1,1}, {1,1}};
        int[][] b = {{2,2}, {2,2}};
        int[][] result = new int[a.length][b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k <a[i].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
