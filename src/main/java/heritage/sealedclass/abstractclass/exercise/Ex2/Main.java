package heritage.sealedclass.abstractclass.exercise.Ex2;

import java.time.LocalDate;

public class Main {
    static void main() {
        Employee[] employees = new Employee[100];

        for (int i = 0; i < 50; i++) {
            employees[i] = new FullTimeEmployee(
                    "id=" + i,
                    "full time empolyee n. " + i,
                    "not unemployed anymore",
                    LocalDate.now(),
                    1500 + i * 2
            );
            employees[50 + i] = new PerHourEmployee(
                    "id=" + 50 + i,
                    "per hour employee n. " + i,
                    "also not unemployed anymore",
                    LocalDate.now(),
                    2 * i,
                    i % 10
            );
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
