package Two_Dimensional_Arrays;

/* The program must accept an integer matrix M of size R*C and an integer N as input.
The program must print sum of diagonal elements of all N*N non overlapping submatrices in M as the output.
The value of N is always greater than 1 and less than or equal to minimum value between R and C

Input format : The first line contains R and C seperated by space. The next R lines each contains C integer values
separated by space. The (R+2)th line contains N.

Output format: The first line contains integer values representing the sum of diagonal elements
of all N*N non overlapping submatrices in M

Example:
Input:
5 6
6 3 6 3 2 1
4 5 7 1 3 8
6 9 8 4 3 2
4 1 8 8 9 1
8 1 5 7 9 0
3

Output:
31 13
(6+5+8+6+6) = 31
(3+3+2+1+4) = 13

Input:
6 6
6 3 6 3 2 1
4 5 7 1 3 8
6 9 8 4 3 2
4 1 8 8 9 1
8 1 5 7 9 0
1 0 6 9 2 1
3

Output:
31 13 20 28
*/

import java.util.Scanner;
public class sum_of_diagonals_of_non_overlapping_submatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int[][] M = new int[R][C];
        for (int i = 0; i < M.length; i++) { // columns
            for (int j = 0; j < M[i].length; j++) { //rows
                M[i][j] = scanner.nextInt();
            }
        }
        int N = scanner.nextInt();
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        //For Matrix of Unequal Rows and Columns
        if(R!=C) {
            //Left Matrix
            for (int i = 0; i < M.length - (R - N); i++) {
                for (int j = 0; j < M[i].length - (C - N); j++) {
                    if (i == j) {
                        sum += M[i][j];
                    }
                    if (i + j == N - 1 && i != j) {
                        sum += M[i][j];
                    }
                }
            }
            //Right Matrix
            for (int i = 0; i < M.length - (R - N); i++) {
                for (int j = N; j < M[i].length; j++) {
                    if (j - i == N) {
                        sum2 += M[i][j];
                    }
                    if (i + j == R && j - i != N) {
                        sum2 += M[i][j];
                    }
                }
            }
            System.out.println(sum);
            System.out.println(sum2);

        //For matrix of Equal rows and columns
        }else{
            //Top left matrix
            for (int i = 0; i < M.length - (R - N); i++) {
                for (int j = 0; j < M[i].length - (C - N); j++) {
                    if (i == j) {
                        sum += M[i][j];
                    }
                    if (i + j == N - 1 && i != j) {
                        sum += M[i][j];
                    }
                }
            }
            //Top right matrix
            for (int i = 0; i < M.length - (R - N); i++) {
                for (int j = N; j < M[i].length; j++) {
                    if (j - i == N) {
                        sum2 += M[i][j];
                    }
                    if (i + j == R-1 && j - i != N) {
                        sum2 += M[i][j];
                    }
                }
            }
            //Bottom left matrix
            for (int i = N ; i < M.length ; i++) {
                for (int j = 0; j < M[i].length - (C - N); j++) {
                    if (i-j == N) {
                        sum3 += M[i][j];
                    }
                    if (i+j==R-1 && i-j!=N) {
                        sum3 += M[i][j];
                    }
                }
            }
            //Bottom right matrix
            for (int i = N; i < M.length; i++) {
                for (int j = N ; j < M[i].length ; j++) {
                    if (i==j) {
                        sum4 += M[i][j];
                    }
                    if (i + j == R+(N-1) && i!=j) {
                        sum4 += M[i][j];
                    }
                }
            }
            System.out.println(sum);
            System.out.println(sum2);
            System.out.println(sum3);
            System.out.println(sum4);
        }
    }
}
