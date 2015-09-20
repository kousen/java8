package nfjs.streams;

import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        double sum = Stream.generate(Math::random)
                .mapToDouble(Double::doubleValue)
                .limit(1000)
                .sum();
        System.out.printf("The total is %s%n", sum);
    }
}
