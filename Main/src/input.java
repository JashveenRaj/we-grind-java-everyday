import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String input1 = scanner.nextLine();

        System.out.println("Hello "+ input1);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        
        //This is must so that the left out newline charecter '/n' is cleared as nextInt() method doesn't read it.

        System.out.println("Your age is: "+ age );

        System.out.println("Enter your degree: ");
        String input2 = scanner.nextLine();

        System.out.println("Your degree is: "+ input2);
        scanner.close();
    }
}
