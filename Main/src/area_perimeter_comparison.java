import java.util.Scanner;

class rectangle{
    public static int perimeter(int l, int b){
        int peri = 2*(l+b);
        return peri;
    }
    public static int area(int l, int b){
        int area = l*b;
        return area;
    }
}

public class area_perimeter_comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        System.out.println("Enter breadth: ");
        int breadth = scanner.nextInt();
        int per = rectangle.perimeter(length,breadth);
        int are = rectangle.area(length,breadth);

        if(are>per){
            System.out.println("Area is greater than perimeter");
        }else{
            System.out.println("Perimeter is greater than area");
        }
    }
}
