package nfjs.streams;

import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {
        double sum = Stream.generate(Math::random)
                .limit(1000)
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.printf("The total is %s%n", sum);
    }
}
