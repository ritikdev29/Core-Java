import java.util.*;

class gen<T> // <T> means typesafety ,, or kisi bhi information kai type ko pass kar sakte hai


{
   T obj;  // 10 yaha par de rhe hai

   // create constructorr

   public gen(T obj){

    this.obj = obj;

   }
   void display()
   {
    System.out.println("type of data is : " + obj.getClass().getName());
   }

   public T getobj()
   {
    return obj;
   }
}

public class generics_03 {
    public static void main(String[] args) {

        // gen g = new gen();

        gen<Integer> g = new gen<Integer>(10);
        g.display();
        System.out.println(g.getobj());  // out =type of data is : java.lang.Integer
                                         //10

         System.out.println("**********************************");


        gen<String> g1 = new gen<String>("Rk");
        g1.display();
        System.out.println(g1.getobj());  // type of data is : java.lang.String

                                         //Rk

       // ArrayList<String> list1  = new ArrayList<String>();

       // List<String> list2 = new ArrayList<String>();

       // Collection<Integer> list3 = new ArrayList<Integer>();

        // List<Object> list4 = new ArrayList<String>(); CE

        
        
    }
    
}
