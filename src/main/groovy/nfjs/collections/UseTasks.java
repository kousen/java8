package nfjs.collections;

import java.util.List;

public class UseTasks {
    public static void main(String[] args) {
        List<Task> tasks = TaskSamples.getSampleTasks();

        double averageDuration = tasks.stream()
                .filter(Task::isActive)
                .mapToInt(Task::getDuration)
                .average()
                .getAsDouble();
        System.out.printf(
                "The average duration is %s%n",
                averageDuration);
    }
}
