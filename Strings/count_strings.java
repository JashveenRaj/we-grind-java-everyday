package Strings;

import java.util.Scanner;

public class count_strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        scanner.nextLine();
        int count = 0;

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        String target = scanner.nextLine();


        for(String string : strings){
            if(string.equalsIgnoreCase(target)){
                count++;
            }
        }
        System.out.println(count);
    }
}
