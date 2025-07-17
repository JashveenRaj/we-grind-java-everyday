package Object_Oriented_Programming;

interface sample{
    boolean greatest(int a, int b);
}

public class Higher_order2 {
    public static void main(String[] args) {
        Higher_order2 higherOrder2 = new Higher_order2();
        higherOrder2.demo2((a,b)-> a>b);
    }
    public void demo2(sample s){
        System.out.println(s.greatest(20,10));
    }
}
