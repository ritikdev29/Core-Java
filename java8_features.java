interface A {
    void show();
    default void config()
    {
        System.out.println("in config..");
    }
    static void abc ()
    {
        System.out.println("in abc");
    }
}
class B implements A 
{
    public void show()
    {
        System.out.println("in show..");
    }
}
public class java8_features {
    public static void main(String[] args) {
        A.abc();
       // A.config(); it wil not work they are doing the work they are changes class B implement A..
       A obj = new B();
       obj.show();
       obj.config();
    }
}
