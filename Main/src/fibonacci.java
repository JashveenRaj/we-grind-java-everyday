public class fibonacci{
    public static int Fibonacci(int n){
        if(n<=0){
            return n;
        }
        int a = 0;
        int b = 1;
        for(int i = 2; i<=n; i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;

    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(Fibonacci(n));
    }
}


