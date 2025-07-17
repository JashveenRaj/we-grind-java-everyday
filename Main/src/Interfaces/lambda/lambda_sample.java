package Interfaces.lambda;

interface calci{
    int add(int a, int b);
}

public class lambda_sample {
    public static void main(String[] args) {
        calci calci = (a,b) -> a+b;
        int n = 4;
        int n1 = 6;

        System.out.println(calci.add(n,n1));
    }
}
