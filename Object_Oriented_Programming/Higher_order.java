package Object_Oriented_Programming;

interface String_conv {
    int length_returner(String a);
}

public class Higher_order {
    public static void main(String[] args) {
        Higher_order higherOrder = new Higher_order();
        higherOrder.demo(a -> a.length());
    }

    public void demo(String_conv h) {
        System.out.println(h.length_returner("Jashveen"));
    }
}
