package Interfaces;

public interface A {
    public abstract void Demo();
}

class childA implements A{
    @Override
    public void Demo() {
        System.out.println("Hello Nigga");
    }
}