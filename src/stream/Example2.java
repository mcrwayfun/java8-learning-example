package stream;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author mcrwayfun
 * @version v1.0
 * @date Created in 2018/11/06
 * @description
 */
public class Example2 {

    public static void main(String[] args) {

        List<Dish> menu = GenDataListUtil.getMenuList();
        // 筛选出卡路里小于400的菜名
        List<String> lowCaloricDishesName =
                menu.stream()
                        .filter(d -> d.getCalories() < 400)
                        .sorted(comparing(Dish::getCalories))
                        .map(Dish::getName)
                        .collect(toList());

        // 按照顺序输出结果
        StringBuilder res = new StringBuilder();
        res.append('[');
        for (int i = 0; i < lowCaloricDishesName.size(); i++) {
            if (i != lowCaloricDishesName.size() - 1)
                res.append(lowCaloricDishesName.get(i) + ",");
            else
                res.append(lowCaloricDishesName.get(i));
        }
        res.append(']');

        System.out.println(res.toString());
    }

}
