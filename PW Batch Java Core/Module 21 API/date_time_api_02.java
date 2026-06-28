import java.time.*;

public class date_time_api_02 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now(); // object return -->
        System.out.println(date);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int years = date.getYear();

        System.out.println(day + "/" + month + "/" + years);

        LocalTime time = LocalTime.now();
        System.out.println("Time is : " + time); // Time is : 17:24:45.454654600 including micro second time

        int hours = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();
        int nano = time.getNano();

        System.out.println(hours + "/" + min + "/" + sec + "/" + nano);
    }

}
