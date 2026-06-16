import java.util.*;
public class arrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque<>();
        ad1.add(100);
        ad1.add(200);
        // i can checked duplicate values is allowed or not ..
        ad1.add(200); // duplicate i s allowed in arraydeque--
        ad1.add(100);
        System.out.println(ad1);  // output = [100, 200]// collection is ad1
        ad1.addFirst(10);
        ad1.addLast(20);
        System.out.println(ad1);  // [10, 100, 200, 20]
        ad1.add("Hello");
        System.out.println(ad1);  // output [10, 100, 200, 200, 100, 20, Hello]

        ad1.offer(500);
        ad1.offerLast(10);
        System.out.println("Offers data = "+ad1);
        
    }
    
}
