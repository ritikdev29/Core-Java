import java.util.*;

class Plane { // this is parent class
    public void planeFliesGoodHeigh() {
        System.out.println("plane is flying...");
    }
}

// @Oveeride method from parent class..
class Cargoplane extends Plane {
    @Override
    public void planeFliesGoodHeigh() {
        System.out.println("Cargo pLane flying is Low...");
    }
}

public class Annotation_11 {
    public static void main(String[] args) {
        Plane pc = new Plane();
        pc.planeFliesGoodHeigh();

    }
}
