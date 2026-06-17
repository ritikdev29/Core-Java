import java.util.*;
public class TreeSet_ {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        System.out.println(ts);


        // methods

        System.out.println(ts.higher(50));  // output = 75
        System.out.println(ts.lower(50));   // 25

        System.out.println(ts.ceiling(40));  // 50

        System.out.println(ts.floor(40));   // 25

         System.out.println(ts.ceiling(50));  // 50   ceiling means upar wala value or equal

        System.out.println(ts.floor(50));  /// 50     floor means niche wala values ..

    }
    
}
