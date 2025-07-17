package Object_Oriented_Programming;

class A{
    String s;
    A(String s) {
        this.s = s;

    }

    @Override
    public boolean equals(Object obj) {
        A a = (A)obj;
        return this.s == a.s;
    }
}

class B{
    String s;
    B(String s){
        this.s = s;
    }

    public boolean equals(Object o){
        B b = (B)o;
        return this.s == b.s;
    }
}

public class equals_overriden {
    public static void main(String[] args) {
        A a = new A("Hello");
        A a1 = new A("Hello");
        A a2 = new A("Hello");
        B b = new B("Hello");
        System.out.println(b.equals(a2));
    }
}
