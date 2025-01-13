package Patterns;

//         5
//       4 5
//     3 4 5
//   2 3 4 5
// 1 2 3 4 5

public class numbered_triangle2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 5; i>=1 ; i--) {
            for (int j = 1 ; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n ; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
