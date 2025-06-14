package Object_Oriented_Programming;
import java.util.Arrays;

class Book implements Comparable{
    String name;
    int price;
    Book(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Object o) {
        Book t = (Book)o;
        if(this.price > t.price){
            return 1;
        }
        if(this.price<t.price){
            return -1;
        }
        return 0;
    }
}


public class comparable {
    public static void main(String[] args) {
        Book b1 = new Book("asf" , 100);
        Book b2 = new Book("chi", 546);
        Book[] b = new Book[4];
        b[0]=new Book("titanic",200);
        b[1]=new Book("raja",999);
        b[2]=new Book("rani",3000);
        b[3]=new Book("tirudhan",152);

        System.out.println(b1.compareTo(b2));

        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.println("name: " + b[i].name + " price: " + b[i].price);
        }
    }
}
