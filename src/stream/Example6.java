package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author mcrwayfun
 * @version v1.0
 * @date Created in 2018/11/06
 * @description filter
 */
public class Example6 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

    }

}
