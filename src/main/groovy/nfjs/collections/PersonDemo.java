package nfjs.collections;

import nfjs.collections.StringSamples;

import java.util.List;
import java.util.stream.Collectors;

public class PersonDemo {
    public List<Person> createPeople() {
        return StringSamples.getSampleNames()
                .stream()
                .map(Person::new)
                .collect(Collectors.toList());
    }

    public List<Person> createTwoArgPeople() {
        return StringSamples.getSampleNames()
                .stream()
                .map(s -> s.split(" "))
                .map(s1 -> new Person(s1[0], s1[1]))
                .collect(Collectors.toList());
    }

    public Person[] createPeopleArray() {
        return StringSamples.getSampleNames()
                .stream()
                .map(Person::new)
                .toArray(Person[]::new);
    }
}
