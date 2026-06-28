import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class stream_api_05 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(8, 4, 2, 7, 9);
        Stream<Integer> streamData = list.stream();

        Stream<Integer> sortedStream = streamData.sorted();

        // sorted method ley kar invoke kar dey sorted method ko
        Stream<Integer> mapStream = sortedStream.map(n -> n * 2);  // one strem one work 
        mapStream.forEach(n -> System.out.println(n));

        sortedStream.forEach(n -> System.out.println(n));

    }

}
