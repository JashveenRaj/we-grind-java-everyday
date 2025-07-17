package Interfaces.lambda;

interface name{
    void name(String n);
}
public class lambda_sample_5 {
    public static void main(String[] args) {
        name name = (n) -> System.out.println(n);
        name.name("Jashveen");
    }
}
