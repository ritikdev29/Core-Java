class Demo1
{
    public void a() //throws exception
    {
       b(); 
    }
    public void b()  // throws exception
    {
        int num1 =8;
        int num2 = 0;
      /*  try{ 

        int result = num1/num2;
        System.out.println(result);
       }
       catch(Exception e){
        System.out.println("Errors.." + e.getMessage());

       }*/

        int result = num1 /  num2;
        System.out.println(result);
    }
}
public class Handling_exception {
    public static void main(String[] args) {
      Demo1 obj =new Demo1();
    //   obj.a();   this par this handling
    try {
        obj.a();    // this is ducking part they are forwar main branch
        
    } catch (Exception e) {
        System.out.println("Error");
    }
    }
    
}
/*
1. Exception Handling (try-catch)

Yahan database connection error ko wahi handle kiya gaya hai.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HandlingExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "1234";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully");

            con.close();
        }
        catch (SQLException e) {
            System.out.println("Database Connection Failed");
            System.out.println(e.getMessage());
        }
    }
}
 */

/*
2. Exception Ducking (throws)

Yahan getConnection() method exception handle nahi kar raha.

Woh exception ko main() ko pass kar raha hai.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DuckingExample {

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";
        String password = "1234";

        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) {

        try {
            Connection con = getConnection();

            System.out.println("Database Connected Successfully");

            con.close();
        }
        catch (SQLException e) {
            System.out.println("Database Error");
            System.out.println(e.getMessage());
        }
    }
}
 */