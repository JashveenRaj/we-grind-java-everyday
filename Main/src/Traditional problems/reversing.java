import java.util.Scanner;

class reverser{
    public static String reverse(String word){
        String reversed_string = "";
        for (int i = 0; i < word.length(); i++) {
            reversed_string = word.charAt(i) + reversed_string;
        }
        return reversed_string;
    }
}

public  class reversing{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String to reverse");
        System.out.println("--------------------------");
        String original_string = scanner.nextLine();
        System.out.println("Original String: " + original_string);
        String result = reverser.reverse(original_string);
        System.out.println("Reversed String: " + result);

    }
}