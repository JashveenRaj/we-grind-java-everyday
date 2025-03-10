package Patterns;
//         1
//       2 2
//     3 3 3
//   4 4 4 4
// 5 5 5 5 5

public class numbered_triangle1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int j=n-i ; j>=1 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
              System.out.print(i);
            }
            System.out.println();
        }
    }
}
