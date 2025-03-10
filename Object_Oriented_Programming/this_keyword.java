package Object_Oriented_Programming;

class Book2{
    //Non-static variables (Global)
    String author;
    String name;
    int price;

    //User defined parameterized constructor
    public Book2(String author, String name, int price){
        //Assigning values from constructor calls to the non-static global variables
        this.author = author;
        this.name = name;
        this.price = price;
    }
}

public class this_keyword {
    public static void main(String[] args) {
        //Calling the constructor and passing values
        Book2 b = new Book2("Jeyamohan" , "Aram", 450);
        Book2 c = new Book2("Tolstoy" , "Anna Karenina" , 500);

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
