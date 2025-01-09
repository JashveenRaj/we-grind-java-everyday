import java.util.Scanner;

class SUM { //Class
    public int add(int a, int b){   //Method
        return a+b;
    }
}

class Diff {
    public int sub(int a, int b){
        return a-b;
    }
}

class Prod {
    public int mult(int a, int b){
        return a*b;
    }
}

class Div {
    public float slash(int a, int b){
        return (float) a /b;
    }
}

class Mod{
    public int modulus(int a, int b){
        return a%b;
    }
}

public class simple_calc{
    public static void main(String[] args) {

        //Getting input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter another number: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter operation you wanna perform: ");

        while(true) {
            System.out.println("1 : Addition");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            int n = scanner.nextInt();
            scanner.nextLine();

            switch (n) {
                case 1:
                    SUM calcSUM = new SUM(); // object calling adds method
                    int result1 = calcSUM.add(a, b);
                    System.out.println("Added value: " + result1);
                    break;

                case 2:
                    Diff calcdiff = new Diff(); //object calling sub method
                    int result2 = calcdiff.sub(a, b);
                    System.out.println("Subtracted value: " + result2);
                    break;

                case 3:
                    Prod calcmult = new Prod(); //object calling mult method
                    int result3 = calcmult.mult(a, b);
                    System.out.println("Multiplied value: " + result3);
                    break;

                case 4:
                    Div calcdiv = new Div(); //object calling Div method
                    float result4 = calcdiv.slash(a, b);
                    System.out.println("Divided value: " + result4);
                    break;

                case 5:
                    Mod calcmod = new Mod(); //object calling mod method
                    int result5 = calcmod.modulus(a, b);
                    System.out.println("Modulus value: " + result5);
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}

