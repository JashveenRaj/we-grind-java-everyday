import java.util.Scanner;

//function findPrimeNumbers(start, end):
//        for currentNumber from start to end:
//        if currentNumber <= 1:
//        continue
//
//isPrime = true
//
//        for divisor from 2 to (currentNumber - 1):
//        if currentNumber % divisor == 0:
//isPrime = false
//        break
//
//        if isPrime is true:
//print currentNumber


public class prime_within_range {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a start range: ");
        int start = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a end range: ");
        int end = scanner.nextInt();
        scanner.nextLine();

        for (int i = start; i < end ; i++) {
            for (int j = start; j < end ; j++) {
                if (i%j==0){

                }else{
                    System.out.println(i);
                }
            }
        }
    }
}
