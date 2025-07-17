package Object_Oriented_Programming;
import java.util.*;

class parent{
    String name;
}
class child extends parent{

    String name;
}
class grand_child extends parent{
    String g_name;
}
public class class_cast_exception {
    public static void main(String[] args) {
        parent parent = new grand_child();
        grand_child grand_child  = (grand_child) new parent();
    }
}