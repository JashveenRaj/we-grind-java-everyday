package Interfaces;

interface animal{
    void make_sound();
}

public class lambda_sample3 {
    public static void main(String[] args) {
        animal animal = ()-> System.out.println("Animal makes sound");
        animal.make_sound();
    }
}
