package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author mcrwayfun
 * @version v1.0
 * @date Created in 2018/11/06
 * @description
 */
public class Example7 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .limit(3)
                .forEach(System.out::println);
    }
}
