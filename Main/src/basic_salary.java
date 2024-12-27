import java.util.Scanner;

class gross{
    public static void salary(int bs){
        if (bs>=10_000 && bs<=20_000){
            int gross_salary1 = bs + (((bs/20)*100) + ((bs/20)*100));
            System.out.println(gross_salary1);
        }
        else if (bs>=20_000 && bs<=30_000){
            int gross_salary2 = bs + (((bs/25)*100) + ((bs/25)*100));
            System.out.println(gross_salary2);
        }
        else{
            int gross_salary2 = bs + (((bs/30)*100) + ((bs/30)*100));
            System.out.println(gross_salary2);
        }
    }
}

public class basic_salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basic_salary = scanner.nextInt();
        scanner.nextLine();
        gross.salary(basic_salary);
    }
}
