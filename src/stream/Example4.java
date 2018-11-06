package stream;

import java.util.List;

/**
 * @author mcrwayfun
 * @version 1.0
 * @description
 * @date Created in 2018/11/6
 */
public class Example4 {

    public static void main(String[] args) {

        List<Dish> menu = GenDataListUtil.getMenuList();
        // 终端操作为void
        menu.stream().forEach(System.out::println);
    }
}
