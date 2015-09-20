package nfjs.lambdas;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AssignDemo {
    public static void main(String[] args) {
        Arrays.asList(3, 1, 4, 1, 5, 9)
                .forEach(System.out::println);

        Consumer<Integer> printer = System.out::println;
        Arrays.asList(3, 1, 4, 1, 5, 9)
                .forEach(printer);

        Arrays.asList(3, 1, 4, 1, 5, 9)
                .stream()
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);

        Predicate<Integer> mod3 = x -> x % 3 == 0;
        Arrays.asList(3, 1, 4, 1, 5, 9)
                .stream()
                .filter(mod3)
                .forEach(System.out::println);

    }
}
