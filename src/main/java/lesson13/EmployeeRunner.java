package lesson13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeRunner {

    public static void main(String[] args) throws IOException {

        // ФИО работников принимаем из txt файла, в котором они указаны построчно
        // Данные для txt файла случайным образом генерируются на интернет ресурсах (в данном случае https://randomus.ru/name)
        // names10 можно заменить на next50 или names100 для загрузки соответственно списков из 50 или 100 человек

        String str = "src\\main\\java\\lesson13\\names10.txt";      // Метод "нагуглил".
        Path path = Path.of(str).toAbsolutePath();                  // Надеюсь не придется при проверке прописывать
        List<String> names = Files.readAllLines(path);              // путь вручную.

        List<Employee> employees = new ArrayList<>();

        // На основании списка имен, итерируя создаем список сотрудников:
        // - имена берем из списка имен
        // - табельный номер - просто нумеруем по порядку
        // - стаж - случайное число от 0 до 39 лет

        System.out.println("Список сотрудников организации:\n");
        int number = 1;
        for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); ) {
            String name = iterator.next();
            Employee employee = new Employee();
            employee.setServiceNumber(number);
            number++;
            employee.setFio(name);
            int workAge = (int) (Math.random() * 40);
            employee.setWorkAge(workAge);
            employees.add(employee);
            System.out.println("ФИО: " + employee.getFio() + "; Таб. номер: " + employee.getServiceNumber() + "; Стаж (лет): " +
                    employee.getWorkAge());
        }

        System.out.println();
        int workAge = 15;
        EmployeeUtils.printEmployee(employees, workAge);

        ListIterator<Employee> backIterator = employees.listIterator(employees.size());
        while (backIterator.hasPrevious()) {
            Employee employee = backIterator.previous();
            if (employees.indexOf(employee) % 2 == 1) {
                backIterator.remove();
            }
        }

        System.out.println("--------------------------------------------------------------\n" +
                "Список после удаления элементов, стоящих на нечетных позициях:\n");
        for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext(); ) {
            Employee employee = iterator.next();
            System.out.println(employees.indexOf(employee) + " " + employee.getFio() + ", табельный номер " +
                    employee.getServiceNumber());
        }
    }
}


