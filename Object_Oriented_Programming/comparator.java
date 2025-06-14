package Object_Oriented_Programming;
import java.util.Comparator;

class Phone {
    String name;
    int price;

    Phone(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class PriceComp implements Comparator {
    public int compare(Object o1, Object o2) {
        Phone p1 = (Phone)o1;
        Phone p2 = (Phone)o2;
        if (p1.price > p2.price) {
            return 1;
        } else if (p1.price < p2.price) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class comparator{
    public static void main(String[] args) {
        Phone p1 = new Phone("Iphone",100000);
        Phone p2 = new Phone("One Plus", 100000);
        System.out.println(new PriceComp().compare(p1,p2));
    }
}