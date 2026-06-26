
import java.io.*;

class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    String name;
    transient String password;

    Student(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class Transient_Selective_Serialization {

    public static void main(String[] args) throws Exception {

        Student s = new Student("Ritik", "abc123");

        FileOutputStream fos = new FileOutputStream("student.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);

        oos.close();
        fos.close();

        System.out.println("Object Serialized Successfully.");
    }
}
