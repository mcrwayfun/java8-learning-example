package stream;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author mcrwayfun
 * @version 1.0
 * @description
 * @date Created in 2018/11/6
 */
public class Example3 {

    public static void main(String[] args) {

        List<Dish> menu = GenDataListUtil.getMenuList();
        // 筛选出卡路里大于300的3个菜名
        List<String> lowCaloricDishesName =
                menu.stream()
                        .filter(d -> {
                            System.out.println("filtering " + d.getName());
                            return d.getCalories() > 300;
                        })
                        .map(d -> {
                            System.out.println("mapping " + d.getName());
                            return d.getName();
                        })
                        .limit(3)
                        .collect(toList());
    }
}
