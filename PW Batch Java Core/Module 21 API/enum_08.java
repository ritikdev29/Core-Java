import javax.naming.spi.DirStateFactory.Result;

enum weeks {
    MON, THE, WED, THU, FRI, SAT, SUN;

}

public class enum_08 {
    enum Result {
        PASS, FAIL, NR;
    }

    public static void main(String[] args) {

        weeks w = weeks.MON;
        System.out.println(w);
        weeks r = weeks.FRI;
        System.out.println(r);

        Result g = Result.PASS;

        System.out.println("your Result is : " + g);

        int index = weeks.MON.ordinal();
        System.out.println(index); // outpu is == 0

        // constant key array bana kar store krega for wek data mai se

        weeks[] wr = weeks.values();

        // System.out.println(wr);
        for (weeks w1 : wr) {

            System.out.println(w1 + " : " + w1.ordinal()); // ou = MON : 0,THE : 1 ..... number of times--->

        }

    }
}