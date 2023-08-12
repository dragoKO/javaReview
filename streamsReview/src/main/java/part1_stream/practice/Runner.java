package part1_stream.practice;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Type.MEAT),
                new Dish("beef", false, 700, Type.MEAT),
                new Dish("chicken", false, 400, Type.MEAT),
                new Dish("fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("fruit", true, 120, Type.OTHER),
                new Dish("pizza", true, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );
        // #1
        menu.stream().
                filter(dish -> dish.getCalories() <= 400).
                forEach(dish -> System.out.print(dish.getName() + " "));

        System.out.println();

        menu.forEach(dish -> System.out.print(dish.getName() + "->" + dish.getName().length() + " "));

        System.out.println();
        // #2
        menu.stream().
                filter(dish -> dish.getCalories() <= 400).
                map(Dish::getName).
                forEach(System.out::println);

        menu.stream().
                map(Dish::getName).
                map(String::length).
                forEach(System.out::println);


    }
}
