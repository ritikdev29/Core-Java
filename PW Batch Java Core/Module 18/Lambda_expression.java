interface Car {
    void drive(int avg,String speed);
    // void hello(); // this is not work why ? two abstract are not allowed
}

public class Lambda_expression {
    public static void main(String[] args) {
       /*
       (avg,speed) this is two parameter 
       only avg  = one parameter they are not user () this braket
       no parametr syntax () empty */
        Car obj = (avg,speed) -> System.out.println("Driving..." + avg + speed);

        obj.drive(16,"  Speed is high.");
    }
}