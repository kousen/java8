package nfjs.collections;

import nfjs.collections.StringSamples;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kousen on 3/5/15.
 */
public class Sorter {
    public List<String> sortAlpha() {
        List<String> sampleStrings = StringSamples.getSampleStrings();
        Collections.sort(sampleStrings);
        return sampleStrings;
    }

    public List<String> sortByLength() {
        List<String> sampleStrings = StringSamples.getSampleStrings();
        Collections.sort(sampleStrings,
                (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        return sampleStrings;
    }

    public List<String> sortByLengthVerbose() {
        List<String> sampleStrings = StringSamples.getSampleStrings();
        Collections.sort(sampleStrings,
                (String s1, String s2) -> {
                    return Integer.compare(s1.length(), s2.length());
                });
        return sampleStrings;
    }

    public List<String> lengthSortComparator() {
        List<String> sampleStrings = StringSamples.getSampleStrings();
        Collections.sort(sampleStrings, Comparator.comparingInt(String::length));
        return sampleStrings;
    }

    public List<String> sortByLengthThenAlpha() {
        List<String> sampleStrings = StringSamples.getSampleStrings();
        Collections.sort(sampleStrings,
                Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.<String>naturalOrder()));
        return sampleStrings;
    }
}
