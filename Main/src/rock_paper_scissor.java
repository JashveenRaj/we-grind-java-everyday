import java.util.Scanner;

class Winner {
    public static void who(char user1, char user2) {

        user1 = Character.toLowerCase(user1);
        user2 = Character.toLowerCase(user2);


        if ((user1 != 'r' && user1 != 'p' && user1 != 's') ||(user2 != 'r' && user2 != 'p' && user2 != 's')) {
            System.out.println("Invalid input! Please enter R, P, or S.");
            return; // apparently break doesn't work inside conditional statements, so return is used.
        }

        if (user1 == user2) {
            System.out.println("It's a tie!");
            return;
        }

        if ((user1 == 'r' && user2 == 's') || (user1 == 'p' && user2 == 'r') || (user1 == 's' && user2 == 'p')) {
            System.out.println("User 1 Wins!");
        } else {
            System.out.println("User 2 Wins!");
        }
    }
}

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, Enter your input (R, P, S): ");
        char u1 = scanner.next().charAt(0);
        System.out.println("Player 2, Enter your input (R, P, S): ");
        char u2 = scanner.next().charAt(0);

        Winner.who(u1, u2);
        scanner.close();
    }
}
