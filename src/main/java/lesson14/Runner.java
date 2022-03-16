package lesson14;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException, IOException {

        String str;
        String newPath;
        Path path;
        Generator generator = new Generator();

        // Список людей структуры "ФИО - номер телефона - оператор", на основании которого будет создаваться список контактов
        // с телефонной книжкой "ФИО - номер телефона - оператор - телефонная книжка
        List<People> peoples = new ArrayList<>();

        int peopleNumber = 3000;            //  Кол-во генерируемых контактов

        generator.namesLoader();            // Загружаем списки имен, отчеств и фамилий для генерации случайных контактов

        peoples = generator.peopleGen(peopleNumber);
        System.out.println("Генерация контактов и их номеров телефонов");
        System.out.println("-------------------------------------------------------------------------\n");
        for (Iterator<People> iterator = peoples.iterator(); iterator.hasNext(); ) {
            People people = iterator.next();
        }

        System.out.println("Генерация записных книжек у каждого контакта");
        System.out.println("-------------------------------------------------------------------------\n");
        List<Owner> owners = new ArrayList<>();
        owners = generator.ownerGen(peoples);                 // Создаем список контактов на основании списка людей


        // Копируем список в массив, чтобы иметь иметь возможность
        // выполнить расчет еще раз, но уже с массивами
        Owner[] owners1 = new Owner[owners.size()];
        for (int i = 0; i < owners.size(); i++) {
            Owner owner = new Owner();
            owner = (Owner) owners.get(i).clone();
            owners1[i] = owner;
        }

        Owner.print(owners);

        System.out.println("Расчет наиболее часто встречающегося контакта с использованием списков запущен.");

        Instant startTime = Instant.now();
        System.out.println("Текущее время " + startTime.atZone(ZoneId.systemDefault()));

        Map<String, Contact> mapForList = new HashMap<>();
        for (Iterator<Owner> iterator = owners.iterator(); iterator.hasNext(); ) {
            Owner owner = iterator.next();
            List<Contact> phoneBook = owner.getOwnerPhoneBook();
            for (Iterator<Contact> bookIterator = phoneBook.iterator(); bookIterator.hasNext(); ) {
                Contact contact = bookIterator.next();
                if (mapForList.containsKey(contact.getPhoneNumber())) {
                    Contact incCount = mapForList.get(contact.getPhoneNumber());
                    incCount.countIncrement();
                    mapForList.put(contact.getPhoneNumber(), incCount);
                } else {
                    contact.setCount(1);
                    mapForList.put(contact.getPhoneNumber(), contact);
                }
            }
        }

        Map.Entry<String, Contact> maxEntry = null;
        for (Map.Entry<String, Contact> entry : mapForList.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        }

        List<Map.Entry<String, Contact>> arrayListMap = new ArrayList<>(mapForList.entrySet());
        Collections.sort(arrayListMap, Map.Entry.comparingByValue());

        System.out.println();
        System.out.println("Расчет с использованием списков закончен.");
        Instant endTime = Instant.now();
        long secondsFrom = startTime.until(endTime, ChronoUnit.MILLIS);

        System.out.println("Текущее время " + endTime.atZone(ZoneId.systemDefault()));
        System.out.println("Расчет длился " + secondsFrom + " миллисекунд.");

        System.out.println("Наиболее часто встречающийся контакт(ы):");
        for (Map.Entry<String, Contact> entry : mapForList.entrySet()) {
            if (entry.getValue().getCount().equals(maxEntry.getValue().getCount())) {
                System.out.print(entry.getValue().getName() + ", тел.: " + entry.getValue().getPhoneNumber() +
                        ", " + entry.getValue().getOperator() + ".   ");
                System.out.println("Контакт встречается " + maxEntry.getValue().getCount() + " раз(a).");
            }
        }

        // Сохраняем в файл полный список контактов, чтобы не загромождать консоль
        str = "src\\main\\java\\lesson14\\resultFiles\\ListContacts.txt";
        path = Path.of(str).toAbsolutePath();
        newPath = path.toString();
        Write ListContactHead = new Write(newPath);
        Write ListContactBody = new Write(newPath, true);
        System.out.println("Список контактов по возрастанию количества их упоминания сохранен в файл ListContact.txt");
        ListContactHead.fileWrite("Список всех контактов по возрастанию количества их упоминания:\n");
        int i = 1;
        for (Map.Entry<String, Contact> value : arrayListMap) {
            ListContactBody.fileWrite(i + ". " + value.getValue().getName() + ", тел.: " +
                    value.getValue().getPhoneNumber() + ", " + value.getValue().getOperator() + ", контакт встречается "
                    + value.getValue().getCount() + " раз(а).");
            i++;
        }

        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Расчет наиболее часто встречающегося контакта с использованием массивов запущен.");

        startTime = Instant.now();
        System.out.println("Текущее время " + startTime.atZone(ZoneId.systemDefault()));

        Map<String, Contact> mapForArray = new HashMap<>();
        for (Owner owner : owners1) {
            List<Contact> phoneBook = owner.getOwnerPhoneBook();
            for (Iterator<Contact> bookIterator = phoneBook.iterator(); bookIterator.hasNext(); ) {
                Contact contact = bookIterator.next();
                if (mapForArray.containsKey(contact.getPhoneNumber())) {
                    Contact incCount = mapForList.get(contact.getPhoneNumber());
                    incCount.countIncrement();
                    mapForArray.put(contact.getPhoneNumber(), incCount);
                } else {
                    contact.setCount(1);
                    mapForArray.put(contact.getPhoneNumber(), contact);
                }
            }
        }

        maxEntry = null;
        for (Map.Entry<String, Contact> entry : mapForArray.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                maxEntry = entry;
        }

        Map.Entry<String, Contact>[] arrayMap;
        arrayMap = mapForArray.entrySet().toArray(new Map.Entry[0]);
        Arrays.sort(arrayMap, Map.Entry.comparingByValue());

        System.out.println();
        System.out.println("Расчет с использованием массивов закончен.");

        endTime = Instant.now();
        long secondsFrom2 = startTime.until(endTime,
                ChronoUnit.MILLIS);

        System.out.println("Текущее время " + endTime.atZone(ZoneId.systemDefault()));
        System.out.println("Расчет длился " + secondsFrom2 + " миллисекунд.");
        System.out.println("Наиболее часто встречающийся контакт(ы):");

        for (Map.Entry<String, Contact> entry : mapForArray.entrySet()) {
            if (entry.getValue().getCount().equals(maxEntry.getValue().getCount())) {
                System.out.print(entry.getValue().getName() + ", тел.: " + entry.getValue().getPhoneNumber() +
                        ", " + entry.getValue().getOperator() + ".   ");
                System.out.println("Контакт встречается " + maxEntry.getValue().getCount() + " раз(a).");
            }
        }

        // Сохраняем в файл полный список контактов, чтобы не загромождать консоль
        str = "src\\main\\java\\lesson14\\resultFiles\\ArrayContacts.txt";
        path = Path.of(str).toAbsolutePath();
        newPath = path.toString();
        Write ArrayContactHead = new Write(newPath);
        Write ArrayContactBody = new Write(newPath, true);
        System.out.println("Список контактов по возрастанию количества их упоминания сохранен в файл ArrayContact.txt");
        ArrayContactHead.fileWrite("Список всех контактов по возрастанию количества их упоминания:\n");
        i = 1;
        for (Map.Entry<String, Contact> value : arrayMap) {
            ArrayContactBody.fileWrite(i + ". " + value.getValue().getName() + ", тел.: " +
                    value.getValue().getPhoneNumber() + ", " + value.getValue().getOperator() + ", контакт встречается "
                    + value.getValue().getCount() + " раз(а).");
            i++;
        }

        System.out.println("--------------------------------------\n");
        System.out.println("Расчет в списках длился " + secondsFrom + " миллисекунд.");
        System.out.println("Расчет в массивах длился " + secondsFrom2 + " миллисекунд.");
    }
}
