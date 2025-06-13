package Object_Oriented_Programming;

class summa{
    public static void suma() throws InterruptedException{
        for (int i = 0; i <= 10 ; i++) {
            Thread.sleep(1000); //without throws we'll get error
            System.out.println(i);
        }
    }
}
public class throws_keyword {
    public static void main(String[] args) {
        try{
            summa.suma();
        }catch(Exception e){
            System.out.println("Caught by Exception"); /*throws, throws the exception to the handling class
                                                        main() method in this class*/
        }
    }
}
