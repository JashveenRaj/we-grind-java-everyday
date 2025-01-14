package Problem_Statements;

public class bank_acc_creation {
    public static void main(String[] args) {
        double deposit = 9000;
        boolean currentAccount = false;

        System.out.println(deposit >= 10000 && currentAccount ==true ? "You got a current account" : deposit >= 10000 && !currentAccount==true ? "Create a current account" : deposit <= 10000 && !currentAccount==true ? "Get a job" : "Create account");
    }
}
