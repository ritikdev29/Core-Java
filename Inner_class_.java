// types of inner class = member , static , Anonymous inner class
class A
{
    public void show()
    {
        System.out.println("in show");
    }
    class B    //  static class B ---static class , they are work only in inner class 
    {
        public void display()
        {
            System.out.println("in display....");
        }
    }

}
public class Inner_class_ {
    public static void main(String[] args) {
        A obj = new A ();
        A.B obj1 = obj.new B();  // the B object creted with the help of the A object
        
       /*  A.B  obj1 = new A.B();  // this are for static class used  static member is not need object...static method they are used class name */
        obj.show();;
        obj1.display();
        
    }
    
}
