package nfjs.collections;

public class Task {
    private Integer id;
    private boolean active;
    private int duration;
    private String name;

    public Task() {}

    public Task(Integer id, boolean active, int duration, String name) {
        this.id = id;
        this.active = active;
        this.duration = duration;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Task{" +
                "active=" + active +
                ", duration=" + duration +
                ", name='" + name + '\'' +
                '}';
    }
}
