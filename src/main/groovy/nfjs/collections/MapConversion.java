package nfjs.collections;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapConversion {
    public static void main(String[] args) {
        List<Task> sampleTasks = TaskSamples.getSampleTasks();

        Map<Integer, Task> taskMap = sampleTasks
                .stream()
                .collect(Collectors.toMap(Task::getId, Function.<Task>identity()));
        System.out.println(taskMap);


    }
}
