package nfjs.collections;

public class Person {
    private String first;
    private String last;

    public Person() {}

    public Person(String name) {
        String[] names = name.split(" ");
        first = names[0];
        last = names[1];
    }

    public Person(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getName() {
        return String.format("%s %s", first, last);
    }
}
