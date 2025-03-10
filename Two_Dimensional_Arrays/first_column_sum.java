package Two_Dimensional_Arrays;

public class first_column_sum {
    public static void main(String[] args) {
        int[][] a = {{1,2,3} , {4,5,6} , {7,8,9}};
        int sum  = 0 ;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(j == 0){
                    sum+=a[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
