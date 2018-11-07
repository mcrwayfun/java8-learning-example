package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author mcrwayfun
 * @version 1.0
 * @description
 * @date Created in 2018/11/7
 */
public class Example12 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("this", "is", "a", "wonderful", "world");
        words.stream()
                .filter(word -> word.length() > 4)
                .findAny()
                .ifPresent(System.out::println);
    }
}
