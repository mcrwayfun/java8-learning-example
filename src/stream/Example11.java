package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author mcrwayfun
 * @version 1.0
 * @description
 * @date Created in 2018/11/7
 */
public class Example11 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world");
        if (words.stream()
                .allMatch(word -> word.contains("o")))
            System.out.println("all match");
    }
}
