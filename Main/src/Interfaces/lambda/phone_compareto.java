package Interfaces.lambda;
import java.util.ArrayList;
import java.util.Collections;

class Phone{
    String name;
    int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo(Phone o){
        return this.price-o.price;
    }
}

public class phone_compareto{
    public static void main(String[] args) {
        ArrayList<Phone> a = new ArrayList<Phone>();
        a.add(new Phone("Lava",10000));
        a.add(new Phone("IQOO", 12000));
        a.add(new Phone("Iphone", 1000000));
        Collections.sort(a,((o1,o2)->o1.name.compareToIgnoreCase(o2.name)));
        for(Phone phone: a){
            System.out.println(phone);
        }
    }
}
