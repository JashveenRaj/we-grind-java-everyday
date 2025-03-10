package Traditional_problems;

public class three_variable_swap {
    public static void main(String [] args){
        int a, b, c, temp;

        a = 10;
        b = 20;
        c = 30;

        temp = a; //temp = 10
        a = b; // a = 20
        b = c; // b = 30
        c = temp ; // c = 10

        System.out.println("a :" + a);
        System.out.println("b :" + b);
        System.out.println("c :" + c);


    }
}
