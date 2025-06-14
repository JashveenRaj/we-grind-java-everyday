package Object_Oriented_Programming;

class book{
    //Non-static variables (Global)
    String author;
    String name;
    int price;

    //User defined parameterized constructor
    public book(String a , String n, int p){
        //Assigning values from constructor calls to the non-static global variables
        author = a;
        name = n;
        price = p;
    }
}

public class constructors_intro_1 {
    public static void main(String[] args) {
        //Calling the constructor and passing values
        book b = new book("Jeyamohan" , "Book1", 450);
        book c = new book("Tolstoy" , "Book2", 500);

        //Printing
        System.out.println(b.author);
        System.out.println(b.name);
        System.out.println(b.price);
        System.out.println();
        System.out.println(c.author);
        System.out.println(c.name);
        System.out.println(c.price);
    }
}
