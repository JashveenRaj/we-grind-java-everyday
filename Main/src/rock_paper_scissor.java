//Write a program that simulates a rock-paper-scissors game.
//Take input from two players as ‘R’, ‘P’, or ‘S’.
//Use if-else determine the winner.

import java.util.Scanner;

class winner{
    public static void who(char user1 , char user2){
        if(Character.toLowerCase(user1) == 'r' && Character.toLowerCase(user2) == 'p'){

        }
    }
}

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, Enter your input (R , P, S): ");
        char u1 = scanner.next().charAt(0);
        System.out.println("Player 2, Enter your input (R, P, S): ");
        char u2 = scanner.next().charAt(0);

        winner.who(u1,u2);
    }
}
