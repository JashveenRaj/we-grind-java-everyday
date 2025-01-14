package Traditional_problems;

public class three_variable_comparsion_using_condope {
        public static void main(String[] args){
            int a,b,c;
            a = 100;
            b = 20;
            c = 51;

            System.out.println(a>b ? "a is greater" : b>c ? "b is greater" : "c is greater");
            System.out.println(a>b ? a>c ? "a is greater" : "c is greater" : b>c ? "b is greater" : "c is greater");
        }
    }

