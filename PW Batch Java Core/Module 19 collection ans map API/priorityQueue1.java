import java.util.PriorityQueue;
public class priorityQueue1 {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);

        pq.add(125);
        pq.add(175);
        
        // pq.add("Rk");
        // System.out.println(pq);  they are error not allowed


        System.out.println(pq);  // output = [25, 50, 150, 100, 125, 175]
        pq.add(25);   // duplicates values are allowed----->

        System.out.println(pq);   // output =[25, 25, 125, 50, 75, 150, 175, 100]
    
      
    }
}