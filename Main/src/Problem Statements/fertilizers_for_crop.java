//In a smart agriculture system, Sharma has a total of n units of fertilizer that he wants to
// distribute across his fields, each field must receive at least m units of fertilizer to
// optimize crop yield and sharma needs to find how many different ways he can distribute the
// fertilizer to his fields ensuring that each field gets at least m units.

//The goal is to determine how many different ways sharma can allocate the fertilizers such that
// the total amount distributed is exactly n units.
//
//input format:
//      n - the total amount of fertilizer Sharma wants to distribute.
//      m - the minimum amount of fertilizer that each field can receive.
//
//output format:
//the output prints a single integer representing the number of ways to Sharma can distribute the fertilizer across fields such that each fields receives at least m units, and total fertilizer distributed adds up to exactly n
//
//sample:
//
//input1 : 3 1 / output1: 3
//input2: 10 2/ output2: 12
//input3: 2 1 / output3: 2

import java.util.Scanner;

 class calc{
    public static int Fertilizer(int total, int minamt){
        int ways =0;
        for(int no_of_field = 1; no_of_field <= total ; no_of_field++){
            int remaining_fertilizer = total - no_of_field * minamt;

            if (remaining_fertilizer>=0){
                ways+=1;
            }
        }
        return ways;
    }
}


public class fertilizers_for_crop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int result = calc.Fertilizer(n,m);
        System.out.println(result);
        scanner.close();
    }
}
