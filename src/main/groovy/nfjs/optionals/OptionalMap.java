package nfjs.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalMap {
    private Map<String,Integer> map = new HashMap<>();

    public OptionalMap() {
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 2);
    }

    public Map<String, Integer> getMap() {
        return map;
    }

    public Optional<Integer> getValue(String key) {
        return Optional.ofNullable(map.get(key));
    }

    public static void main(String[] args) {
        OptionalMap uo = new OptionalMap();
        System.out.println(uo.getMap());
        System.out.println(uo.getMap().get("d"));
        System.out.println(uo.getValue("d"));
        System.out.println(uo.getValue("d").orElse(999));
    }
}
