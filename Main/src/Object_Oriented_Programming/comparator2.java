package Object_Oriented_Programming;
import java.util.*;

class Phone_p {
    String name;
    int price;

    Phone_p(String name, int price){
        this.name = name;
        this.price = price;
    }
}

class BrandComp implements Comparator<Phone_p> {
    public int compare(Phone_p p1, Phone_p p2) {
        return p1.name.compareToIgnoreCase(p2.name);
    }
}

public class comparator2 {
    public static void main(String[] args) {
       Phone_p[] phones = new Phone_p[3];
       phones[0] = new Phone_p("Iphone", 20000);
       phones[1] = new Phone_p("Samsung" , 154466);
       phones[2] = new Phone_p("moto" , 78634);

        Arrays.sort(phones, new BrandComp());

        for (Phone_p phone : phones) {
            System.out.println("Brand: " + phone.name + " Price: " + phone.price);
        }
    }
}
