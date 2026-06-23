import java.util.*;
public class generics_04 {
    public static void main(String[] args) {

        ArrayList tr = new  ArrayList<>();

        tr.add(100);
        tr.add(50);
        tr.add(150);
        tr.add(25);
        tr.add(75);
        tr.add(125);
        System.out.println(tr);  // ou = [100, 50, 150, 25, 75, 125]

        Collections.sort(tr);

        System.out.println("*******in sorted order ***********");
        System.out.println(tr);  // outpu = [25, 50, 75, 100, 125, 150]


        // they are used generics concept they are stored data in String


         ArrayList<String> tr1 = new  ArrayList<String>();

        tr1.add("Ritik");
        tr1.add("JAVA");
        tr1.add("PYTHON");
        tr1.add("GAUTAM");
        tr1.add("SIDHU");
        tr1.add("ABHAY");
        System.out.println(tr1);  // 

        Collections.sort(tr1);
        System.out.println("*******in sorted order in String ***********");


        System.out.println(tr1);  // [ABHAY, GAUTAM, JAVA, PYTHON, Ritik, SIDHU]


        ArrayList tr2 = new  ArrayList<>();

        tr2.add(100);
        tr2.add(50);
        tr2.add(150);
        tr2.add(25);
        tr2.add(75);
        tr2.add(125);
        System.out.println(tr2);  // ou = 

        // they are search data in tr2 at index
  // pahley data ko sort karna hoga then hum binarySearch apply kar saktey hai 
        int index = Collections.binarySearch(tr2,150); //stored the data in index

        System.out.println("Index is : " + index);  // Index is : 2

        Collections.rotate(tr2, 3);
        System.out.println(tr2); // ou = [25, 75, 125, 100, 50, 150]

         //shuffle() method  , means mixed data-->

         Collections.shuffle(tr2);
         System.out.println("Shuffle data is : " + tr2);  // ou = Shuffle data is : [125, 75, 150, 100, 25, 50]






        
    }
    
}
