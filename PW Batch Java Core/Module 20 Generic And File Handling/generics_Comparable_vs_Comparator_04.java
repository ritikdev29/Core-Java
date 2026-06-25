import java.util.*;

class Student
{
    int marks;
    int age;
    String name;

    public Student(int marks, int age, String name)
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
        return marks + " - " + age + " - " + name;
    }

    static class Alpha implements Comparator<Student>
    {
        public int compare(Student a, Student b)
        {
            if(a.age > b.age)
                return 1;
            else if(a.age < b.age)
                return -1;
            else
                return 0;
        }
    }
}

public class generics_Comparable_vs_Comparator_04
{
    public static void main(String[] args)
    {
        Student str1 = new Student(94, 21, "Ritik Kumar");
        Student str2 = new Student(95, 20, "Gautami");
        Student str3 = new Student(99, 19, "Sidhu");

        List<Student> list = new ArrayList<>();

        list.add(str1);
        list.add(str2);
        list.add(str3);

        System.out.println("Before Sorting: " + list);

        Student.Alpha a = new Student.Alpha();

        Collections.sort(list, a);

        System.out.println("After Sorting: " + list);
    }
}