package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author mcrwayfun
 * @version v1.0
 * @date Created in 2018/11/06
 * @description
 */
public class Example1 {

    public static void main(String[] args) {

        List<Dish> menu = GenDataListUtil.getMenuList();

        // 用累加器筛选元素
        List<Dish> lowCaloricDishes = new ArrayList<>();
        for (Dish d : menu) {
            if (d.getCalories() < 400) {
                lowCaloricDishes.add(d);
            }
        }

        // 用匿名类对菜肴进行排序
        Collections.sort(lowCaloricDishes, new Comparator<Dish>() {
            public int compare(Dish d1, Dish d2) {
                return Integer.compare(d1.getCalories(), d2.getCalories());
            }
        });

        // 处理排序后的菜名列表
        List<String> lowCaloricDishesName = new ArrayList<>();
        for (Dish d : lowCaloricDishes) {
            lowCaloricDishesName.add(d.getName());
        }

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
