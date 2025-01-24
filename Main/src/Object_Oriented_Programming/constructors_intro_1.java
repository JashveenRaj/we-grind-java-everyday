package Object_Oriented_Programming;

class Book{
    //Non-static variables (Global)
    String author;
    String name;
    int price;

    //User defined parameterized constructor
    public Book(String a , String n, int p){
        //Assigning values from constructor calls to the non-static global variables
        author = a;
        name = n;
        price = p;
    }
}

public class constructors_intro_1 {
    public static void main(String[] args) {
        //Calling the constructor and passing values
        Book b = new Book("Jeyamohan" , "Aram", 450);
        System.out.println(b.author);
        System.out.println(b.name);
        System.out.println(b.price);
    }
}
