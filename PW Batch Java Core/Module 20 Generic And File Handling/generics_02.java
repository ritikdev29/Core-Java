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
    // More than create objects ---> or jitni chahe utni object bna sakte hai

    Student std1 = new Student();
    Student std2 = new Student();


    Employee em1= new Employee();
    Employee em2= new Employee();

   ArrayList<Student> al = new ArrayList<Student>();  // kisi bhi type kai object stored kar sakte hai  ,, keval student waley data kai liye work  karna hai to <srudent> likh diya 
    al.add(std1);
    al.add(std2);

    // al.add(em1); this or error because <Student > , the error solve then write<Employess>--->


    }

}
