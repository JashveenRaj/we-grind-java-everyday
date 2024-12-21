public class student_report_card {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-11s %-8s %-8s %-8s %-7s %-12s\n" , "Roll No" , "Name" , "Sub1" , "Sub2" , "Avg" , "Pass/Fail");
        System.out.println("--------------------------------------------------------");

        int roll1 = 1;
        String name = "Lakshmi";
        int sub1 = 80;
        int sub2 = 90;
        double avg = (sub1+sub2)/2;
        String pass_fail = avg>=50 ? "Pass" : "Fail";

        System.out.printf("%3s %14s %8s %6s %7s %10s\n" , roll1, name , sub1 , sub2 , avg, pass_fail);

        int roll2 = 2;
        String name2 = "Jashveen";
        int sub1_j = 65;
        int sub2_j = 72;
        double avg_j = (sub1_j + sub2_j)/2;
        String pass_fail_j = avg_j >=50 ? "Pass" : "Fail";

        System.out.printf("%3s %15s %7s %6s %7s %10s\n" , roll2, name2 , sub1_j, sub2_j, avg_j, pass_fail_j);
        System.out.println("--------------------------------------------------------");
    }
}
