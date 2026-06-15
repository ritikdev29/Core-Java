import java.util.*;
class Human1
{
 private String name;
 int age;
 Human1()
 {
    System.out.println("Human class constructor....");
 }
 void sleep()
 {
    age = 18;
    name = "Ritik";
    System.out.println("Human needs Good sleep..");
    System.out.println(age);
    System.out.println(name);
 }   
}
class Student1 extends Human1
{
    // // public Student1()
    // //{ 
    // super();

    // }
    void disp()
    {
        System.out.println("The age is : " + age);
        // System.out.println("The name is : " + name);
    }
}
public class inheritance{
    public static void main (String []args){
        Student1 str = new Student1();
        str.sleep();
        str.disp();

    }
}