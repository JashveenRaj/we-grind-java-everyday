package Interfaces.lambda;

interface calcu{
    int addi(int a, int b, int c);
}

interface calcu2{
    int sub(int a , int b);
}

interface calcu3{
    int mult(int a , int b);
}

interface calcu4{
    int div(int a , int b);
}

interface calcu5{
    int cube(int a);
}

public class lambda_sample_4 {
    public static void main(String[] args) {
        calcu calc = (a,b,c) -> {return a+b+c;};
        calcu2 calc2 = (a,b) -> {return a-b;};
        calcu3 calc3 = (a,b) -> {return a*b;};
        calcu4 calc4 = (a,b)-> {return a/b;}; //explicit return
        calcu5 calc5 = (a) -> a*a*a; //implicit return

        System.out.println("Addition: " + calc.addi(10,20,30));
        System.out.println("Subtraction: " + calc2.sub(50,40));
        System.out.println("Multiplication: " + calc3.mult(10,20));
        System.out.println("Division: " + calc4.div(40,2));
        System.out.println("cube: " + calc5.cube(27));
    }
}
