import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}

public class Serialization {

    public static void main(String[] args) throws Exception {

        Cricketer c = new Cricketer("Ritik", 44, 300000);

        FileOutputStream fos = new FileOutputStream("Rk.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(c);

        oos.close();

        System.out.println("Object Serialized Successfully.");
    }
}