package Two_Dimensional_Arrays;

import java.util.Arrays;

public class set_matrix_zero {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3} , {4,0,6}, {7,8,9}};
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    a = i;
                    b = j;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==a || j==b){
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
