package Two_Dimensional_Arrays;

public class diagonal_elements {
    public static void main(String[] args) {
        int[][] a = {{1,2,3} , {1,1,3} , {1,2,3}};
        int sum = 0;

        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if(i==j){
                    sum+=a[i][j];
                }
            }
        }
        System.out.print("Sum of Diagonal Elements is: " + sum);
    }
}
