package nfjs.collections;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        Optional<Double> total = Stream.generate(Math::random)
                .limit(1000)
                .reduce((x, y) -> x + y);
        System.out.println(total.orElse(0.0));

        total = Stream.generate(Math::random)
                .limit(1000)
                .reduce(Double::sum);
        System.out.println(total.orElse(0.0));

        Random r = new Random();
        double tot = r.doubles()
            .limit(1000)
            .sum();
        System.out.println(tot);
    }
}
