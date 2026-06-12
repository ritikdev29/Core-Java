// Abstract class
abstract class Phone {
    String model;
    int price;

    // Constructor
    Phone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // Abstract method (must be implemented by child classes)
    abstract void features();

    // Normal method
    void showDetails() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

// Subclass 1
class IPhone extends Phone {
    IPhone(String model, int price) {
        super(model, price);
    }

    @Override
    void features() {
        System.out.println("Features: iOS, FaceID, Super Retina Display");
    }
}

// Subclass 2
class Samsung extends Phone {
    Samsung(String model, int price) {
        super(model, price);
    }

    @Override
    void features() {
        System.out.println("Features: Android, AMOLED Display, S-Pen Support");
    }
}

// Main class
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p1 = new IPhone("iPhone 15", 120000);
        Phone p2 = new Samsung("Galaxy S24", 100000);

        p1.showDetails();
        p1.features();

        p2.showDetails();
        p2.features();
    }
}
