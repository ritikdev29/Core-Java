import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream_api_06 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 5, 3, 6, 7, 8, 4);

        Stream<Integer> streamData = list.stream();
        // long count = streamDate.count();
        // System.out.println(count); // ou = 6

        // Stream<Integer> sortedStream = streamData.sorted(); // they are create new
        // strem

        Stream<Integer> filData = streamData.filter(n -> n % 2 == 0); // used for filter data for only even numbers---
        // Stream<Integer> sortedStream.filData.sorted();
        Stream<Integer> sortedStream = filData.sorted();

        Stream<Integer> mapStream = sortedStream.map(n -> n * 2); // map funtion or method ye new stream de dega--->

        mapStream.forEach(n -> System.out.println(n));

        // sortedStream.forEach(n -> System.out.println(n)); // new strem par iterate
        // kar rhe hai---->

        // streamDate.forEach(n -> System.out.println(n)); // this are given errors --->
        // because one strem one times work not many times work--

    }

}
