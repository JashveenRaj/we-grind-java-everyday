package Patterns;

public class normal_traingle_2 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n ; i++) {
            int temp = 1;
            for (int j = 1; j <= 2*n-1 ; j++) {
                if(j-i<=n-1 && j+i>=n+1){
                    System.out.print(temp++ + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
