package Two_Dimensional_Arrays;

import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//        a[0][0] = 1;
//        a[0][1] = 2;
//        a[0][2] = 3;
//        a[1][0] = 4;
//        a[1][1] = 5;
//        a[1][2] = 6;
//        a[2][0] = 7;
//        a[2][1] = 8;
//        a[2][2] = 9;

//        for(int[] i : a){
//           for(int j : i){
//             System.out.print(j);
//           }
//         }
//        for(int[] i : a){
//            System.out.println(Arrays.toString(i));
//        }
