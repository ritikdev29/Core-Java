import java.util.*;
class Student {
    private String name;
    private int id;
}

class Employee {
    private String name;
    private int id;
}

public class generics_02 {
    public static void main(String[] args) {
    // More than create objects --->

    Student std1 = new Student();
    Student std2 = new Student();


    Employee em1= new Employee();
    Employee em2= new Employee();

   ArrayList al = new ArrayList();
    al.add(std1);
    al.add(std2);


    }

}
