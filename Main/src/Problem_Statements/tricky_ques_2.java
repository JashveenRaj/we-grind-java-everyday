public class tricky_ques_2 {
        public static void main(String[] args) {
            int a = 20, b = 10;
            boolean c = true, d = false;
            a = c ? b++ : b--; //a=10
            c = !d; // c = true
            System.out.print((a+b)+" "+(c ? 5 : 10)); //10+11 = 21 , 5

        }
}