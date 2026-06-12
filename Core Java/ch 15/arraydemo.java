// import java.util.*;
// public class arraydemo {

//     public static void main(String[] args) {
//        ArrayList<Integer> l1 = new ArrayList<>();
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        l1.add(6);
//        l1.add(5,5);

//     //    System.out.println("Total element is : " +l1);
//     System.out.println("Array list before : " + l1);
//     l1.remove(2);
//     System.out.println("Array list after removing the value at index 2 : "+l1);





//     }
// }
import java.util.*;
public class arraydemo extends Thread{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(6);
        l1.add(3);

        System.out.println("L1 Array list : "+ l1);
        System.out.println("The last occurrence of 3 in l1 is at index : " + l1.lastIndexOf(30));


    }
}

