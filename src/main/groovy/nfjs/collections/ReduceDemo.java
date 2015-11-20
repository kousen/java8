package nfjs.collections;

import java.awt.*;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceDemo {
    public static void main(String[] args) {
        Optional<Double> total = Stream.generate(Math::random)
                .limit(1000)
                .reduce((x, y) -> x + y);
        System.out.println(total.orElse(0.0));

        String result = StringSamples.getSampleStrings()
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
        System.out.println(result);

        Integer totalLength = StringSamples.getSampleStrings()
                .stream()
                .collect(Collectors.summingInt(String::length));
        System.out.println(totalLength);

        Function<String, String> f = (s) -> {
            System.out.println(Thread.currentThread());
            return s.toUpperCase();
        };

        Optional<String> val = StringSamples.getSampleStrings()
                .parallelStream()
                .map(f)
                .reduce((x, y) -> x + y);
        System.out.println(val.orElse("other"));

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
