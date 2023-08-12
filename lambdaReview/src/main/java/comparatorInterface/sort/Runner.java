package comparatorInterface.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Oleh", "Kochetkov", 150_00),
                new Employee("John", "Doe", 160_00),
                new Employee("Alice", "Johnson", 170_00),
                new Employee("Michael", "Smith", 180_00),
                new Employee("Emma", "Williams", 190_00),
                new Employee("Alice", "Johnson", 100_00),
                new Employee("alice", "Johnson", 100_00)
        ));
        Comparator<Employee> eSort = Comparator.comparing(firstName -> firstName.getFirstName());

        employees.sort(Comparator.comparing(firstName -> firstName.getFirstName().toLowerCase()));
        System.out.println(employees);

        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(employees);


    }
}
