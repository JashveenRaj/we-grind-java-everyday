import java.util.Scanner;


class check{
    public static void character(char a){
        if(a>=65 && a <=90){
            System.out.println("Given character is an Uppercase Alphabet");
        } else if (a>=97 && a<=122) {
            System.out.println("Given character is an LowerCase Alphabet");
        } else if(a>=48 && a<=57){
            System.out.println("Given character is an Integer");
        } else if (a>=32 && a<=47 || a>=58 && a<=64 || a>=91 && a<=96 || a>=123 && a<=126) {
            System.out.println("Given character is a Special Character");
        }
    }
}
public class check_char {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.println("Enter a Character (A-Z / a-z / Special chars / 1-~)");
            char user = scanner.next().charAt(0);
            check.character(user);
            System.out.println();
            System.out.println("--------------------------------------------------");
        }
    }
}
