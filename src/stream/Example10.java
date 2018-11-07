package stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author mcrwayfun
 * @version 1.0
 * @description
 * @date Created in 2018/11/7
 */
public class Example10 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "mcrwayfun");
        if (words.stream()
                .anyMatch(word -> word.equals("mcrwayfun")))
            System.out.println("the word 'mcrwayfun' is exist");
    }
}
