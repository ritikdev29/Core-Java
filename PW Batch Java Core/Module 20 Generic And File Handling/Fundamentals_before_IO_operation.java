class Student {
    private String name;
    private int age;
    private String city;

    // create constructor

    public Student(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String toString() // i can ovveride--->
    {
        return "Name : " + name + " | Age : " + age + "| City : " + city;

        // outpu = Name : Abahy | Age : 20| City : Lucknow
        // Name : Sachine | Age : 21| City : Mumbai
    }
}

public class Fundamentals_before_IO_operation {
    public static void main(String[] args) {

        // create object for student
        Student st1 = new Student("Abahy", 20, "Lucknow");
        System.out.println(st1);// Student@2a139a55

        Student st2 = new Student("Sachine", 21, "Mumbai");
        System.out.println(st2); // oiu =Student@15db9742

    }

}
