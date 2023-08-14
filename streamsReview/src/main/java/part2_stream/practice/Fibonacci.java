package part2_stream.practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        Stream.iterate(new int[]{0, 1}, ints -> new int[]{ints[1], ints[0] + ints[1]})
                .limit(20)
                .map(Arrays::toString)
                .forEach(System.out::print);

        System.out.println("\n************************************************************************");

        Stream.iterate(new int[]{0, 1}, ints -> new int[]{ints[1], ints[0] + ints[1]})
                .limit(20)
                .map(arr -> arr[0] + arr[1] + " -> ")
                .forEach(System.out::print);
    }
}
