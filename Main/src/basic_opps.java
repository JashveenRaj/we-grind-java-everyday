class Sum{ //Class
    public int add(int a, int b){   //Method
        int c = a+b;
        return c;
    }
}


public class basic_opps{
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        Sum calcSum = new Sum(); // object
        int result = calcSum.add(a, b);
        System.out.println(result);
    }
}
