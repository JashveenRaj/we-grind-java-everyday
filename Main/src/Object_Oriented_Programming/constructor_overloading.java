package Object_Oriented_Programming;

class Book3{
    String name;
    String author;
    int price;

    public Book3(String name, String author, int price){
        this(name, price);
        this.author=author;

    }

    public Book3(String name, int price){
        this.name = name;
        this.price = price;
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        Book3 b = new Book3("Aram" , "Jeyamohan", 400);
        System.out.println(b.author);
        System.out.println(b.name);
        System.out.println(b.price);
    }
}
