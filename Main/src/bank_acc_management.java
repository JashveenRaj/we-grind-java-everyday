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

        int exisiting_amt = 2000;
        System.out.println("Welcome To Dubakoor Banking 🙏");
        while(true){
            //Get user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("===============================");
            System.out.println("Choose an operation: ");
            System.out.println("1.Check balance");
            System.out.println("2.Withdraw Money");
            System.out.println("3.Deposit Money");
            System.out.println("4.Exit");
            System.out.println("===============================");
            System.out.println();

            int user = scanner.nextInt();
            scanner.nextLine();


            switch(user) {
                case 1:
                    Checkbalance checkbalance = new Checkbalance();
                    int balance = checkbalance.balance(exisiting_amt);
                    System.out.println("Balance in your account: " + balance);
                    break;

                case 2:
                    Withdraw_money withdrawMoney = new Withdraw_money();
                    System.out.println("Enter amount to withdraw: ");
                    int to_withdraw = scanner.nextInt();
                    scanner.nextLine();
                    int amt_drawn = 0;
                    if (to_withdraw > exisiting_amt) {
                        System.out.println("You don't have sufficient balance, Please enter a Smaller amount!");
                    } else {
                        amt_drawn = withdrawMoney.take_out(to_withdraw, exisiting_amt);
                        System.out.println("Amount withdrawn: " + to_withdraw);
                        System.out.println("Current Balance: " + amt_drawn);
                    }
                    exisiting_amt = amt_drawn;
                    break;

                case 3:
                    System.out.println("Enter a amount to deposit: ");
                    int to_put = scanner.nextInt();
                    scanner.nextLine();
                    Deposit_money depositMoney = new Deposit_money();
                    int pass_amt = depositMoney.take_in(to_put,exisiting_amt);
                    System.out.println("Current Balance: " + pass_amt);
                    exisiting_amt = pass_amt;
                    break;

                default:
                    System.exit(0);
            }
        }
    }
}
