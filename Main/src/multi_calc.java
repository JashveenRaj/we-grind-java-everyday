import java.util.ArrayList;
import java.util.Scanner;

class add{
    public static int addition(ArrayList<Integer> a){
        int added =0;
        for (int i : a) {
            added+=i;
        }
        return added;
    }
}

public class multi_calc {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Start ");
            System.out.println("2. Quit");
            int n = scanner.nextInt();
            scanner.nextLine();

            switch(n){
                case 1:
                    System.out.println("Enter no of values you gonna use: ");
                    int num_of_times = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println();
                    for (int i = 0; i < num_of_times; i++) {
                        System.out.println("Enter value " + i + " :");
                        int num = scanner.nextInt();
                        arrlist.add(num);
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("Result"+ add.addition(arrlist));
                    break;

                case 2:
                    System.exit(0);
                    break;
            }
        }
    }
}
