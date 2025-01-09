import java.util.Scanner;

class age{
    public static String eligible(int a){
        if(a>=18){
            return "You can vote";
        }else {
            return "You can't vote";
        }
    }
}

public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a age nibba: ");
        int user = scanner.nextInt();
        System.out.println(age.eligible(user));
    }
}
