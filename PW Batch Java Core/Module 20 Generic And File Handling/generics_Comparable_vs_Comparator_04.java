import java.util.*;

class Student
{
    int marks;
    int age;
    String name;
    public Student(int marks,int Age,String name)
    {
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks()
    {
        return marks;
    }
    public int getAge() 
    {
         return age;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return " " + marks + " - " + age + " - " + name;
    }

}
public class generics_Comparable_vs_Comparator_04 {

    public static void main(String[] args) {

        Student str1 = new Student(94, 21, "Ritik Kumar ");
        Student str2 = new Student(95, 20, "Gautami");

        List<Student> list = new ArrayList<Student>();  // generics concept use--->

        list.add(str1);
        list.add(str2);
        System.out.println("Data is :" + list);
    }
    
}
