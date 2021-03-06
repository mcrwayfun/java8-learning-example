package stream;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author mcrwayfun
 * @version 1.0
 * @description
 * @date Created in 2018/11/7
 */
public class Example9 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java 8", null,"Lambdas", "In", "Action");
        List<Character> wordLengths = words.stream()
                .map(word -> {
                    if(word != null)
                    return word.charAt(0);
                    return 'a';
                })
                .collect(toList());
        System.out.println(wordLengths);
    }
}
