import java.util.HashSet;

public class hashSet1 {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Ritik");
        names.add("Aman");
        names.add("Ritik");

        System.out.println(names);

        // output = [Aman, Ritik]  Ek hi "Ritik" store hua.
        /*
         * mportant Methods
         * add()
         * remove()
         * contains()
         * size()
         * clear()
         */
    }
}