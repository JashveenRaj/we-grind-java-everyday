package Interfaces;

//Functional Interface
interface calc{
    int add(int a, int b);
}

class suma implements calc{
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
public class interface_sample2  {
    public static void main(String[] args) {
        suma suma = new suma();
        System.out.println(suma.add(5,10));
    }
}
