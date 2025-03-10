package Patterns;

//         5
//       4 5
//     3 4 5
//   2 3 4 5
// 1 2 3 4 5

public class numbered_triangle2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n ; i>=0 ; i--) {
            for (int k = i; k>=0 ;k--) {
                System.out.print(" ");
            }
            for (int j = n-i; j>=i ; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}