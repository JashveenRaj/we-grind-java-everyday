import java.util.Scanner;

public class fav_food {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you fav food: ");
        String food = scanner.nextLine();
        String s= food.trim().toLowerCase();

        if (s.equals("biriyani")){
            System.out.println("Your fav food is biriyani");
        } else if (s.equals("shawarma")) {
            System.out.println("Your food is shawarma");
        }else {
            System.out.println("Soru thindra naye");
        }
    }
}
