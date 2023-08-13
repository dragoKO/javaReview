package part2_stream.flatMap.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<State> states = new ArrayList<>(Arrays.asList(
                new State(new ArrayList<>(Arrays.asList("Philadelphia", "Pittsburgh", "Bethlehem")))
        ));
        states.stream().
                flatMap(state -> state.getCities().stream()).
                forEach(System.out::println);

        states.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("*************************************************************");
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 35, 6));
        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);

        System.out.println("*************************************************************");
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 4, 6));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 0, 10, 12));

        List<int[]> result = numbers1.stream()
                .flatMap(n1 -> numbers2.stream()
                        .map(n2 -> new int[]{
                                n1, n2
                        }))
                .collect(Collectors.toList());

        result.stream()
                .map(Arrays::toString)
                .forEach(System.out::print);

    }
}
