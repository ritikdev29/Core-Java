interface Car
{
    void drive();  //Matlab jo bhi class Car ko implement karegi usko drive() method define karna padega.
}

public class Annonymous_inner_class {
    public static void main(String[] args) {
        //Anonymous class ban rahi hai:
        Car obj = new Car()
        {
            public void drive()
            {
                System.out.println("Driving....");
            }
        };
        obj.drive();
    }
    
}
