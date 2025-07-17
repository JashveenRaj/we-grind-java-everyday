package Object_Oriented_Programming;

public class excepton_handling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = {1,2,3,4};

        try {
            int c = a / b;
            arr[4] = 6;
        } catch (ArrayIndexOutOfBoundsException z) {
            System.out.println("Array error naina");
        }catch (ArithmeticException e){
            System.out.println("Arithmatic error ra sinni");
        }finally{
            System.out.println("emma emma");
        }
    }
}
