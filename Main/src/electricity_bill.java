import java.util.Scanner;

class calc_curr {
    public static void bill(int unit) {
        double unit_50 = 0.5;
        double unit_150 = 0.75;
        double unit_200 = 1.50;
        double unit_250 = 2.00;
        double total = 0;

        if (unit >= 0 && unit <= 50) {
            double amt = unit * unit_50;
            total = amt + ((amt / 100) * 20);
            System.out.println("Your amount is: " + total);

        } else if (unit > 50 && unit <= 150) {
            double amt1 = 50 * unit_50;
            int remaining_units1 = unit - 50;
            double amt2 = remaining_units1 * unit_150;
            total = amt1 + amt2 + (((amt1 + amt2) / 100) * 20);
            System.out.println("Your amount is: " + total);

        } else if (unit > 150 && unit <= 200) {
            double amt1 = 50 * unit_50;
            double amt2 = 100 * unit_150;
            int remaining_units2 = unit - 150;
            double amt3 = remaining_units2 * unit_200;
            total = amt1 + amt2 + amt3 + (((amt1 + amt2 + amt3) / 100) * 20);
            System.out.println("Your amount is: " + total);

        } else if (unit > 200 && unit <= 250) {
            double amt1 = 50 * unit_50;
            double amt2 = 100 * unit_150;
            double amt3 = 50 * unit_200;
            int remaining_units3 = unit - 200;
            double amt4 = remaining_units3 * unit_250;
            total = amt1 + amt2 + amt3 + amt4 + (((amt1 + amt2 + amt3 + amt4) / 100) * 20);
            System.out.println("Your amount is: " + total);
        } else {
            System.out.println("Invalid number of units");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of electricity units: ");
        int units = scanner.nextInt();
        bill(units);
        scanner.close();
    }
}
