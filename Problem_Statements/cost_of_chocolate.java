package Problem_Statements;
public class cost_of_chocolate {
    public static void main(String[] args) {
        int ram_has = 250;
        double cost_of_one = 13.35;
        int no_of_chocolates = ram_has/(int)cost_of_one;
        System.out.println("Ram can buy " + no_of_chocolates + " chocolates");
    }
}
