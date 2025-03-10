package Traditional_problems;

public class harshad_number {
    public static void main(String[] args) {
        int num = 18;
        int num2 = num;
        int sum = 0;

        while(num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }

        if(num2%sum==0){
            System.out.println("Its an Harshad Number");
        }else{
            System.out.println("Not a Harshad Number");
        }
    }
}
