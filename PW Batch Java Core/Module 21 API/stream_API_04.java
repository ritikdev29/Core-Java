import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class stream_API_04 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 5, 8, 9);
        Stream<Integer> streamDate = list.stream();

        streamDate.forEach(n -> System.out.println(n)); // streamDate par not multiples time work

        // streamDate.forEach(n -> System.out.println(n)); // these are not multiple
        // times execute because runtimeerror,or exception, only one time execute

    }

}
