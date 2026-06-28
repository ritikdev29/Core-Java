// import java.util.Date;
// import java.util.ArrayList;

public class date_time_api_01 {
    public static void main(String[] args) {

        java.util.Date dt = new java.util.Date(); // or import kai liye
        System.out.println(dt); // out = Sun Jun 28 16:52:58 IST 2026 curret time and date

        long timeInMs = dt.getTime();
        java.sql.Date dt1 = new java.sql.Date(timeInMs); // Ms = mili second mai give the result date and time --->

        System.out.println(dt1);

        /*
         * java.util.ArrayList al = new java.util.ArrayList<>(); // this is package
         * java.util
         * 
         * System.out.println(al);
         */

    }
}