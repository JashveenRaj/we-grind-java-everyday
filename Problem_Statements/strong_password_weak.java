package Problem_Statements;
//145 - 1! + 4! + 5! = 145 - Strong - return 1
// if weak return 0

public class strong_password_weak {
    public static void main(String[] args) {
        int num  = 123;
        int temp = num;
        int sum = 0;
        int mult_sum = 1;
        while(num>0){
           int rem= num % 10;
           for(int i=rem; i>0 ; i--){
               mult_sum = mult_sum*i;
           }
           sum+=mult_sum;
           mult_sum = 1;
           num = num / 10;
        }
        if(temp==sum){
            System.out.println("Your pass word is strong : 1");
        }else{
            System.out.println("Not Strong : 0");
        }
    }
}
