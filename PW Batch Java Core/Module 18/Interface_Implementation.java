interface A{
    void show();

}
interface X{
    void abc();
}
class B implements A,X{ // i can acess multiple inteface but all interface is defined medentary in method defined
    public void show()
    {
        System.out.println("in show ");
    }
    public void abc(){
        System.out.println("in abcd");
    }
}

public class Interface_Implementation {
    public static void main(String[] args) {
        // A obj = new B(); this object is only one acess the interface
        B obj = new B(); // this object is method acess in multiple. or refers the B class A and X  --->

        obj.show();
        obj.abc();
        
    }
    
}
