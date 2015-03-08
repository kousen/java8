package nfjs.collections;

import nfjs.collections.StringSamples;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kousen on 3/5/15.
 */
public class PersonDemo {
    public List<Person> createPeople() {
        return StringSamples.getSampleNames().stream()
                .map(Person::new)
                .collect(Collectors.toList());
    }

    public Person[] createPeopleArray() {
        return StringSamples.getSampleNames().stream()
                .map(Person::new)
                .toArray(Person[]::new);
    }
}
