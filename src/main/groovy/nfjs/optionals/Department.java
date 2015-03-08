package nfjs.optionals;

import java.util.Optional;

public class Department {
    private Optional<Manager> boss;

    public Optional<Manager> getBoss() {
        return boss;
    }

    public void setBoss(Manager boss) {
        this.boss = Optional.of(boss);
    }
}
