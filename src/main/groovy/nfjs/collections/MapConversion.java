package nfjs.collections;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapConversion {
    public static void main(String[] args) {
        Map<Integer, Task> taskMap = TaskSamples.getSampleTasks()
                .stream()
                .collect(Collectors.toMap(Task::getId, Function.<Task>identity()));
        System.out.println(taskMap);
    }
}
