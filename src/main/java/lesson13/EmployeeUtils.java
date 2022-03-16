package lesson13;

import java.util.Iterator;
import java.util.List;

public class EmployeeUtils {

    /**
     * Метод выводит в консоль имена и количество работников, имеющих определенный стаж работы
     *
     * @param employees - список всех работников
     * @param workAge   - стаж работы
     */
    public static void printEmployee(List<Employee> employees, int workAge) {

        int count = 0;
        System.out.println("Стаж работы " + workAge + " (полных лет) имеют следующие работники:\n");
        for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext(); ) {
            Employee employee = iterator.next();
            if (employee.getWorkAge() == workAge) {
                count++;
                System.out.println(employee.getFio() + ", табельный номер " + employee.getServiceNumber());
            }
        }
        System.out.println("--------------------------------------------------------------");
        if (count != 0) {
            System.out.println("Всего " + count + " человек.\n");
        } else {
            System.out.println("Работников со стажем " + workAge + " (полных лет) в организации нет.");
        }
    }
}
