package Two_Dimensional_Arrays;
import java.util.Arrays;

class Solution_matrix {
    public static void setZeroes(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    count++;
                }
            }
        }

        int[][] index_holder = new int[count][2];
        int index1 = 0 ;
        for (int i = 0; i < arr.length; i++) {  //{{0,1,2,0},{3,4,5,2},{1,3,1,5}}
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 0){
                    index_holder[index1][0] = i;
                    index_holder[index1][1] = j;
                    index1++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {  //{{0,1,2,0},{3,4,5,2},{1,3,1,5}}
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < index_holder.length; k++) {
                    int row = index_holder[k][0]; //{{0,0} , {0,3}}
                    int col = index_holder[k][1];
                    if (row == i || col == j) {
                        arr[i][j] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

public class set_matrix_zero {
    public static void main(String[] args) {
        int[][] a = {{0,1,2,0},{3,4,5,2},{4,3,1,5}};
        Solution_matrix.setZeroes(a);
    }
}
