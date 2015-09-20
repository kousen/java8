package nfjs.optionals;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UseDepartment {
    public static void main(String[] args) {
        Manager mrSlate = new Manager("Mr. Slate");
        Department d = new Department();
        d.setBoss(mrSlate);

        System.out.println(d.getBoss()
                .map(Manager::getName)
                .orElse("Unknown"));

        Company co = new Company();
        co.setDepartment(d);

        System.out.println(co.getDepartment()
                .flatMap(Department::getBoss)
                .map(Manager::getName)
                .orElse("Unknown"));

        Optional<Company> company = Optional.of(co);

        System.out.println(company
                        .flatMap(Company::getDepartment)
                        .flatMap(Department::getBoss)
                        .map(Manager::getName)
                        .orElse("Unknown")
        );

        String name = "Mal Reynolds";
        Map<String, Manager> managers = new HashMap<>();
        Manager manager = managers.computeIfAbsent(name, Manager::new);
        System.out.println(managers);
    }
}
