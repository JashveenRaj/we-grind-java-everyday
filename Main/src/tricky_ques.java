import java.util.Scanner;

class que_1{
    public static void trick1(){
        int a = 15, b = 4;
        int c = a / b; // Integer division
        int d = a % b; // Modulus operator
        c = d%a;
        d = c%b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("c = " + c);
    }
}

class que_2{
    public static void trick2(){
        int x = 10, y = 20, z = 10;
        boolean result1 = (x == z) && (y > z);
        boolean result2 = (x != y) || (z < x);
        boolean result3 = !(x > y);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}

class que_3{
    public static void trick3() {
        int a = 5;
        a += 3;
        a *= 2;
        a -= 4;
        System.out.println("Final value of a = " + a);
    }
}

class que_4{
    public static void trick4(){
        int x = 5;
        int y = ++x + x++ + --x + x--; //6 , 6 , 6, 6 = 24 (x=5)
        int z = x-- + --y + y-- + y + x++ + ++x; //5, (x=4) , 23 , 23 (y=22) , 22 , 4 (x=5) , x = 6 => 83
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); //22
        System.out.println("z = " + z);//83
    }
}

class que_5{
    public static void trick5(){
        int a = 10, b = 3;
        int result = a * b + a / b - a % b; //30 + 3 - 1
        System.out.println("result = " + result); //32
    }
}

class que_6{
    public static void trick6(){
        int a = 5, b = 2;
        double result = a / b + 1.5; // Observe integer division
        System.out.println("result = " + result);
    }
}

class que_7{
    public static void trick7(){
        int x = 10, y = 20; boolean result = x > y && x != y || x == 10;
        System.out.println("result = " + result); //result = true
    }
}

class que_8{
    public static void trick8(){
        int a, b, c;
        a = b = c = 50;
        System.out.println(a + ", " + b + ", " + c); //50,50,50
    }
}

class que_9{
    public static void trick9(){
        int x = 5;
        int y = x++ + ++x + x--; //5 (6) + 7 + 7 (6) = 19
        System.out.println("x = " + x + ", y = " + y); //x = 6 , y = 19

    }
}

class que_10{
    public static void trick10(){
        int x = 0, y = 5;
        boolean result = (x != 0) && (y / x > 1);
        System.out.println("result = " + result); //false
    }
}

class que_11{
    public static void trick11(){
        byte b = 127; b += 1;
        System.out.println("b = " + b); //-128
    }
}

class que_12{
    public static void trick12(){
        int x = -13, y = 4;
        System.out.println("x % y = " + (x % y)); //-1

    }
}

public class tricky_ques {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number of the problem (1-12): ");
            int n = scanner.nextInt();
            scanner.nextLine();


            switch (n){
                case 1:
                    que_1.trick1();
                    break;

                case 2:
                    que_2.trick2();
                    break;

                case 3:
                    que_3.trick3();
                    break;

                case 4:
                    que_4.trick4();
                    break;

                case 5:
                    que_5.trick5();
                    break;

                case 6:
                    que_6.trick6();
                    break;

                case 7:
                    que_7.trick7();
                    break;

                case 8:
                    que_8.trick8();
                    break;

                case 9:
                    que_9.trick9();
                    break;

                case 10:
                    que_10.trick10();
                    break;

                case 11:
                    que_11.trick11();
                    break;

                case 12:
                    que_12.trick12();
                    break;

                default:
                    System.exit(0);

            }
        }
    }
}
