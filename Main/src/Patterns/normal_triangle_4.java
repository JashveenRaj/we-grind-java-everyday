package Patterns;

public class normal_triangle_4 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n ; j++) {
                if(j-i <= n-1 && j+i >= n+1){
                    System.out.print(i);
                }else if(j+1 == n){
                    System.out.print(" ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
