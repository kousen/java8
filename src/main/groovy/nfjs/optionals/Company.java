package nfjs.optionals;

import java.util.Optional;

/**
 * Created by kousen on 3/8/15.
 */
public class Company {
    private Optional<Department> department;

    public Optional<Department> getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = Optional.of(department);
    }
}
