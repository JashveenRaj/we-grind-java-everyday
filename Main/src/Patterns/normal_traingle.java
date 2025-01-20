package Patterns;

public class normal_traingle {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                if(j-i<=n-1 && j+i>=n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  "); // 2 spaces
                }
            }
            System.out.println();
        }
    }
}
