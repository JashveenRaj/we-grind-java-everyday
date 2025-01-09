public class is_prime2 {
    public static void main(String[] args) {

        //COUNTER METHOD

        int n = 15;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                count++; // if the count is more than 2 than it's not a prime number
                        // prime numbers only has 1-2 common factors
        }
        }if(count == 2){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not prime number");
        }
    }
}
