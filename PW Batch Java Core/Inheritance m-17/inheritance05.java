import java.util.*;
// Types of methods (Inherited, Overidding, Specialized)
class Aeroplane {
    public void takeoff() {
        System.out.println("Airplane is taking off..");
    }

    public void fly() {
        System.out.println("Airplane is fly...");
    }
}

class cargoplane extends Aeroplane {
    public void fly() {
        System.out.println("Cargoplane flyies at lower height..");

    }

    public void CarryGoods() {
        System.out.println("Cargo plane carries Goods ..");
    }

}

class PassengerPlane extends Aeroplane {
    public void fly() {
        System.out.println("Passengerplane flyies at medium height ...");
    }

    public void CarryPassengers() { // this are specialized method becase no presant in parent class this method
                                    // --->
        System.out.println("PassengerPlane carries Passengers..");
    }

}

class inheritanceS {

}

public class inheritance05 {
    public static void main(String[] args) {
        // i can first step crete a object for excess cargoplane
        // cargoplane c1 = new cargoplane();
        // c1.fly();
        // c1.takeoff();

    }

}
