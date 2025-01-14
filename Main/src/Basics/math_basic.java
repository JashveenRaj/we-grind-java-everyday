package Basics;

public class math_basic {
    public static void main(String[] args) {
        int num = 10;

        int num_add1 = num + 1;  //addition
        int num_sub1 = num - 1;  //subtraction
        int num_mul = num * 2;   //multiplication
        int num_div1 = num / 2;  //division, gives quotient
        int num_div2 = num % 2;  //division but gives remainder
        int num_add2 = num++;    //adds 1, value changes but still prints out original value only
        int num_sub2 = num--;    //subs 1, value changes but still prints out original value only

        System.out.println(num_add1);
        System.out.println(num_sub1);
        System.out.println(num_mul);
        System.out.println(num_div1);
        System.out.println(num_div2);
        System.out.println(num_add2);
        System.out.println(num_sub2);

    }
}
