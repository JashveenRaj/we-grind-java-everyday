package Interfaces.lambda;

interface calcu{
    int addi(int a, int b, int c);
}

public class lambda_sample_4 {
    public static void main(String[] args) {
        calcu calc = (int a,int b, int c) ->{ return a+b+c;};
        System.out.println(calc.addi(10,20,30));
    }
}
