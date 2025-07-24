package Basics;
import java.util.*;

// Prime numbers are not perfect squares

class summa {
    public static boolean isBrave(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class Count_Primes_Brave_Soldiers {
    public static void main(String[] args) {
        int N = 1000000;

        int primeCount = 0;
        for (int i = 1; i <= N; i++) {
            if (summa.isBrave(i)) {
                primeCount++;
            }
        }
        System.out.println(primeCount);
    }
}
