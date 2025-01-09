import java.util.Scanner;

//input : 123456
//output : 456123

public class splitting_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an even digit number to switch places: ");
        int n = scanner.nextInt();
        int nn = n;
        int num = n;
        int count = 0;
        int result=0;
        int result2 =0;

        while(n>0){
            n/=10;
            count++;
        }

        for (int i = 0; i < count/2 ; i++) {
            num/=10;
        }

        while(nn>0){
            int rem = nn%10;
            result=(result*10)+rem;
            nn=nn/10;
        }

        for (int i = 0; i < count/2 ; i++) {
            result/=10;
        }

        while(result>0){
            int rem = result%10;
            result2=(result2*10)+rem;
            result=result/10;
        }

        System.out.println("Final answer: " + result2 + num);
    }
}
