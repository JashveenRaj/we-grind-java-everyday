package scenario_questions;

import java.util.Scanner;

public class contact_filter_inator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[] arr = new String[size];
        scanner.nextLine();

        for(int i = 0 ; i<size ; i++){
            arr[i] = scanner.nextLine();
        }

        System.out.println("Enter char: ");
        char c = scanner.next().charAt(0);

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i].toLowerCase().startsWith(c+"")){
                System.out.println(arr[i]);
            }
        }
    }
}
