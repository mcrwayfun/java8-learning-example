package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author mcrwayfun
 * @version 1.0
 * @description 生成流
 * @date Created in 2018/11/6
 */
public class Example5 {

    public static void main(String[] args) {

        // 3.1.1 从collection中生成
        List<Dish> menu = GenDataListUtil.getMenuList();
        Stream<Dish> stream1 = menu.stream();

        // 3.1.2 由值创建流
        Stream<String> stream2 = Stream.of("mcrwayfun", "is", "a", "coder");
        // 创建一个空的stream
        Stream<String> stream3 = Stream.empty();

        // 3.1.3 由数组创建一个流
        int[] nums = new int[]{1, 2, 3, 4, 5};
        IntStream stream4 = Arrays.stream(nums);

        // 3.1.4 从文件中创建一个流
        System.out.println("从文件中创建一个流");
        try (Stream<String> stream5 = Files.lines(Paths.get("src/data.txt"))) {
            // 打印data.txt内容
            stream5.forEach(System.out::println);
        } catch (IOException e) {
            // log
        }

        // 3.1.5 创建无限流
        System.out.println("创建无限流:iterate");
        Stream.iterate(0, n -> n + 2)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("创建无限流:generate");
        Stream.generate(Math::random)
                .limit(3)
                .forEach(System.out::println);

    }
}
