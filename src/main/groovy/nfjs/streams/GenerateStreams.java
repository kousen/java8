package nfjs.streams;

import java.math.BigInteger;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class GenerateStreams {
    public static void main(String[] args) {
        Stream<String> stringStream =
                Stream.of("this", "is", "a", "stream", "of", "strings");

        Stream<Double> doubles = Stream.generate(Math::random)
                .limit(1000);

        Stream<BigInteger> nums = Stream.iterate(BigInteger.ZERO,
                n -> n.add(BigInteger.ONE));


    }
}
