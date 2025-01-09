public class order_of_operation {
    public static void main(String [] args){
        float x = 2, y =5;

        float a = (x*y/x);
        float b = (x*(y/x));

        System.out.println(a);
        System.out.println(b);
    }
}
