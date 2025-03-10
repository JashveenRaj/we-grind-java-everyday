package Two_Dimensional_Arrays;
import java.util.Arrays;

public class transpose_of_matrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3} , {4,5,6} , {7,8,9}}; // {{1,4,7} , {2,5,8} , {3,6,9}}
        int[][] b = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i != j){
                    b[i][j] = a[j][i];
                }else{
                    b[i][j] = a[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(b));
    }
}
