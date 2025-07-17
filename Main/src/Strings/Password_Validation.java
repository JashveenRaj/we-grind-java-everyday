/*
    - At least 4 characters long.
    - Contains at least one numeric digit.
    - Contains at least one capital letter.
    - Must not have a space or a forward slash ('/').
    - The starting character must not be a number.
    - Return 1 if valid, 0 otherwise.
*/
package Strings;
import java.util.*;

public class Password_Validation {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String: ");
            System.out.println();

            String s = sc.nextLine();
            char[] c = s.toCharArray();

            boolean one_digit = false;
            boolean one_caps = false;
            boolean no_forward_slash = true;
            boolean starting_is_digit = false;
            boolean no_space = true;

            if (c.length < 4) {
                System.out.println("Invalid");
                return;
            }

            for (int i = 0; i < c.length; i++) {
                if (c[i] >= '0' && c[i] <= '9') {
                    one_digit = true;
                }
                if (Character.isUpperCase(c[i])) {
                    one_caps = true;
                }
                if (!(c[0] >= '0' && c[0] <= '9')) {
                    starting_is_digit = true;
                }
                if (c[i] == '/') {
                    no_forward_slash = false;
                }
                if ((c[i] == ' ')) {
                    no_space = false;
                }
            }

            if (one_digit && one_caps && starting_is_digit && no_forward_slash && no_space) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
