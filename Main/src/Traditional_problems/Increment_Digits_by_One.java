package Traditional_problems;

public class Increment_Digits_by_One {
    public static void main(String[] args) {
        int num = 7653;
        int out = 0;
        int result = 0;

        while(num!=0){
            int n = num%10;
            out = (out*10)+(++n);
            num/=10;
        }
        while(out!=0){
            int n = out%10;
            result = (result*10)+(n);
            out/=10;
        }
        System.out.println(result);
    }
}
