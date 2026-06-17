import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Ritik");
        students.put(102, "Aman");
        students.put(103, "Rahul");

        System.out.println(students);

        // output = {101=Ritik, 102=Aman, 103=Rahul}
        // Access value = System.out.println(students.get(101)); output Ritik

        /*
         * Importance Method
         * put()
         * get()
         * remove()
         * containsKey()
         * containsValue()
         * keySet()
         * values()
         * entrySet()
         * size()
         */
    }
}