package Interfaces.lambda;

interface sample{
    void start();
}
public class lambda_sample2 {
    public static void main(String[] args) {
        sample s = ()-> System.out.println("Start");
        s.start();
    }
}
