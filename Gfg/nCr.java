package Gfg;

public class nCr {
    public static void main(String[] args) {
        // code here
        int n = 5;
        int r = 2;
        long m = n ;
        long p = r;

        long fact1=1l;
        while(n>0){
            fact1*=n;
            n--;
        }

        long fact2 = 1l;
        while(r>0){
            fact2*=r;
            r--;
        }

        long diff = m-p;
        long fact3 = 1l;
        while(diff>0){
            fact3*=diff;
            diff--;
        }
        int result = (int) ((int)fact1/(fact2*fact3));
        System.out.println(result);
    }
}
