package Two_Dimensional_Arrays;

public class jagged_array {
    public static void main(String[] args) {
        int[][] a = {{1}, {4,5} , {6,7,8}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) { // NOTE - a[i].length
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
