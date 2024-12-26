import java.util.Scanner;

class Checkbalance{
    public static int balance(int bal){
        return bal;
    }
}

class Withdraw_money {
    public static int take_out(int get, int money) {
        return money - get;

    }
}

class Deposit_money{
    public static int take_in(int put, int money){
        return money+put;
    }
}

public class bank_acc_management {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int exisiting_amt = 2000;
        int pass = 9345;

        System.out.println("Welcome To Dubakoor Bank 🍺");
        System.out.println("Enter your password");
        int code = scanner.nextInt();
        scanner.nextLine();

        if (code == pass){
            System.out.println("Hello Lakshmipathi Ramesh");
            while(true){
                //Get user input
                System.out.println("===============================");
                System.out.println("Choose an operation: ");
                System.out.println("0.Deposit/Withdraw Limit");
                System.out.println("1.Check balance");
                System.out.println("2.Withdraw Money");
                System.out.println("3.Deposit Money");
                System.out.println("4.Exit");
                System.out.println("===============================");
                System.out.println();

                int user = scanner.nextInt();
                scanner.nextLine();


                switch(user) {

                    case 0:
                        System.out.println("Deposit limit : 200000");
                        System.out.println("Withdraw limit : 20000");
                        break;

                    case 1:
                        int balance = Checkbalance.balance(exisiting_amt);
                        System.out.println("Balance in your account: " + balance);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        int to_withdraw = scanner.nextInt();
                        scanner.nextLine();
                        int amt_drawn = 0;
                        if (to_withdraw > exisiting_amt) {
                            System.out.println("You don't have sufficient balance, Please enter a Smaller amount!");
                        } else {
                            amt_drawn = Withdraw_money.take_out(to_withdraw, exisiting_amt);
                            System.out.println("Amount withdrawn: " + to_withdraw);
                            System.out.println("Current Balance: " + amt_drawn);
                        }
                        exisiting_amt = amt_drawn;
                        break;

                    case 3:
                        System.out.println("Enter a amount to deposit: ");
                        int to_put = scanner.nextInt();
                        scanner.nextLine();
                        int pass_amt = Deposit_money.take_in(to_put,exisiting_amt);
                        System.out.println("Current Balance: " + pass_amt);
                        exisiting_amt = pass_amt;
                        break;

                    default:
                        System.exit(0);
                }
            }

        }else{
            System.out.println("Yarra nee");
        }
    }
}
