package Arrays;

public class sum_of_primes {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7}; //
        int sum =0;
        for (int i = 0; i < a.length; i++) {
                int count = 0 ;
            for (int j = 1; j <= a[i] ; j++) {
                if(a[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
