package Two_Dimensional_Arrays;

import java.util.Arrays;

public class transpose_using_swap {
    public static void main(String[] args) {
        int[][] a = {{1,2,3} , {4,5,6}, {7,8,9}}; // {{1,4,7} , {2,5,8} , {3,6,9}}
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a[i].length; j++) {
                if(i!=j){
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
