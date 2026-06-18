
import java.util.*;
public class generics_01 {
    public static void main(String[] args) {

        // typeSafety
       /*  String ar [] = new String[10];
        ar[0] ="Rider";
        ar[1] = "Hider";
        ar[2] = "sk";
        ar[3] = 20; //CE 
        */

  // generics mai bta dete hai kis data par work arna hai jaise ismai String btaya gya hai
        // No safety ---->

        // Typesafety achived using generics ---->
        ArrayList<String> tr = new ArrayList<String>();  // <> this is used for typecasting like String <String> ,, yaha par String  type ka hi data store hoga -->
        tr.add("Rk");
        tr.add("GK");

        //tr.add(20);

        //String n1 = (String)tr.get(0); // typecasting
       // String n2 = (String)tr.get(1);
        //String n3 = (String)tr.get(2);

        
    }
    
}
