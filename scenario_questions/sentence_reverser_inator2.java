package scenario_questions;

import java.util.Scanner;

public class sentence_reverser_inator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] a = s.split(" ");
        int i = 0;
        int j = a.length-1;

        while(i<j){
            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]+" ");
        }
    }
}
