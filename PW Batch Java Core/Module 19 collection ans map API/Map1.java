import java.util.*;
public class Map1 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable<>();

        ht.put(1, "Ritik");
        // ht.put(2, "Rahul");
        ht.put(3, "Gautam");

        ht.putIfAbsent(2, "Rahul");  // absent case they are used print for values ---->

        // ht.put(null, "kjdcd");  null values or not accept...

        System.out.println(ht);  // output = {3=Gautam, 2=Rahul, 1=Ritik}


        TreeMap tm = new TreeMap<>();
        tm.put(2, "Ritik");
        tm.put(1, "Gautam");
        tm.put(4, "Rahul");
        tm.put(3, "Rohit");

        System.out.println(tm);
        
    }
    
}
