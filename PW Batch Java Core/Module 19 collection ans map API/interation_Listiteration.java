import java.util.*;

public class interation_Listiteration {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(100);
        // use for loop
        for (int i = 0; i < a1.size(); i++) {
            // Object o = a1.get(i);
            // System.out.println(o);

            // or

            System.out.println(a1.get(i));
        }

        // for each loop use
        System.out.println("Used for each loop..");
        for (Object o : a1) {

            System.out.println(o);
        }

           System.out.println("Iterator is used.....");
        Iterator itr = a1.iterator();  // iterator means traverse kar ka data ko ley lena...
        while (itr.hasNext()) {

            // Integer i = (Integer)itr.next();  type casting

            System.out.println(itr.next());
            
        }
        
        System.out.println("ListIterator used...");
        ListIterator litr = a1.listIterator(a1.size());

        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
            
        }

    }

}
