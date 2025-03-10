package Interfaces;

public interface B{
    public abstract void Demo();
}

class childB implements B{
    @Override
    public void Demo(){
        System.out.println("Gigga");
    }
}
