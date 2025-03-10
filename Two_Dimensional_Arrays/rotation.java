package Two_Dimensional_Arrays;

public class rotation {
    public static void main(String[] args) {
        int[][] a = {{1,2,3} ,{4,5,6}, {7,8,9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                int temp = a[i][j];
                a[i][j+1] = a[i][j];
                a[i][j+2] = temp;
            }
        }
        for(int[] i : a ){
            for(int j : i){
                System.out.print(j);
            }
        }
    }
}
