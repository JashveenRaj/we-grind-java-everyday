public class report_card {
    public static void main(String[] args) {
        // Header for the report card
        System.out.printf("%-10s %-15s %5s %5s %5s %8s %6s\n", "Roll No", "Name", "Sub1", "Sub2", "Sub3", "Avg", "Pass");
        System.out.println("---------------------------------------------------------------");

        // For Alice
        int rollNoAlice = 1;
        String nameAlice = "Alice";
        int sub1Alice = 80;
        int sub2Alice = 85;
        int sub3Alice = 90;
        double avgAlice = (sub1Alice + sub2Alice + sub3Alice) / 3.0;
        boolean passAlice = avgAlice >= 50;
        System.out.printf("%-10d %-15s %5d %5d %5d %8.2f %6b\n",
                rollNoAlice, nameAlice, sub1Alice, sub2Alice, sub3Alice, avgAlice, passAlice);

        // For Bob
        int rollNoBob = 2;
        String nameBob = "Bob";
        int sub1Bob = 45;
        int sub2Bob = 50;
        int sub3Bob = 40;
        double avgBob = (sub1Bob + sub2Bob + sub3Bob) / 3.0;
        boolean passBob = avgBob >= 50;
        System.out.printf("%-10d %-15s %5d %5d %5d %8.2f %6b\n",
                rollNoBob, nameBob, sub1Bob, sub2Bob, sub3Bob, avgBob, passBob);

        // For Charlie
        int rollNoCharlie = 3;
        String nameCharlie = "Charlie";
        int sub1Charlie = 75;
        int sub2Charlie = 80;
        int sub3Charlie = 85;
        double avgCharlie = (sub1Charlie + sub2Charlie + sub3Charlie) / 3.0;
        boolean passCharlie = avgCharlie >= 50;
        System.out.printf("%-10d %-15s %5d %5d %5d %8.2f %6b\n",
                rollNoCharlie, nameCharlie, sub1Charlie, sub2Charlie, sub3Charlie, avgCharlie, passCharlie);
    }
}
