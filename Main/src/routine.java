import java.util.Scanner;

public class routine {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while(true) {
            System.out.println("Enter a Day to get your routine: ");
            String user = scanner.nextLine();
            String user_s = user.toLowerCase().trim();

            switch (user_s) {
                case "monday":
                    System.out.println("Monday routine 😭");
                    break;
                case "tuesday":
                    System.out.println("Tuesday routine 😢");
                    break;
                case "wednesday":
                    System.out.println("Wednesday routine 🥲");
                    break;
                case "thursday":
                    System.out.println("Thursday routine ☹️");
                    break;
                case "friday":
                    System.out.println("Friday routine 🙂");
                    break;
                case "saturday":
                    System.out.println("Saturday routine ☺️");
                    break;
                case "sunday":
                    System.out.println("Sunday routine 🥳");
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
