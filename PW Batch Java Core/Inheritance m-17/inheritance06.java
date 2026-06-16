// package inheritance05;
class Demo1 
{
    int a, b;
    public Demo1()
    {
        System.out.println();
    }
    public Demo1(int x,int y)
    {
        System.out.println("Parameterized Parent Constructor..");
        a =x;
        b =y;
    }
}
class Demo2 extends Demo1 
{
    int m,n;
    public Demo2()
    {
        // super();
        this(10,20);
        System.out.println("Child class Constructor..");
        
    }
    public Demo2(int x,int y)
    {
        // super();
        System.out.println("Paramiterized child class constructor");
        m =x;
        n = y;
    }
}
public class inheritance06 {
    public static void main(String[] args) {
         Demo2 d = new Demo2();   //output = Paramiterized child class constructor
                                             //Child class Constructor..
        

        // Demo2 d2 = new Demo2(10,20);
        
    }
    
}
