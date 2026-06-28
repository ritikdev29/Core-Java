import java.util.*;

public class for_each_method_03 {
    public static void main(String[] args) {

        // List<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(4);
        // list.add(5);
        // list.add(8);
        // list.add(9);

        // System.out.println(list);

        List<Integer> list2 = Arrays.asList(2, 4, 5, 8, 9); // Arrays object make collection object ----->
        System.out.println(list2);

        /*
         * for(Object o: list2)
         * {
         * System.out.println(o);
         * }
         */
        // OR

        // for (Integer i : list2) {
        // System.out.println(i);
        // }

        // Consumer<Integer> cons = i -> System.out.ptintln(i);

        // list2.forEach(cons);

        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        };
    }

}
