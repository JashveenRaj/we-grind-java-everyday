public class greatest_of_four {
    public static void main(String[] args) {
        // Declare 4 numbers
        int a = 10;
        int b = 25;
        int c = 15;
        int d = 5;

        // Find the greatest number using nested ternary operators
        int greatest = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d)) : ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));

        // Print the result
        System.out.println("The greatest number is: " + greatest);
    }
}
