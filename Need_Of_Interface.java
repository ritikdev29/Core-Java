interface Computer 
{
    void compileCode();
}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("you get six errors");
    }
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You get 5 errors, Faster");
    }
}
class Developer
{
    public void buildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.compileCode();
    }
}
public class Need_Of_Interface {
    public static void main(String[] args) {
        Computer obj = new Desktop();
        Developer dev = new Developer();
         dev.buildApp(obj);


        
    }
    
}
