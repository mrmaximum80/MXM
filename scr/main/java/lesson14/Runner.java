package lesson14;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException, IOException {

        Generator generator = new Generator();

        // Список людей структуры "ФИО - номер телефона - оператор", на основании которого будет создаваться список контактов
        // с телефонной книжкой "ФИО - номер телефона - оператор - телефонная книжка
        List<People> peoples = new ArrayList<>();

        int peopleNumber = 3000;            //  Кол-во генерируемых контактов

        generator.namesLoader();            // Загружаем списки имен, отчеств и фамилий для генерации случайных контактов

        peoples = generator.peopleGen(peopleNumber);
        System.out.println("Генерация контактов и их номеров телефонов");
        System.out.println("--------------------------------------");

        for (Iterator<People> iterator = peoples.iterator(); iterator.hasNext(); ) {
            People people = iterator.next();
            System.out.println(peoples.indexOf(people) + " " + people.getFio() + ", тел.: " +
                    people.getPhoneNumber() + ", " + people.getMobileOperator());
        }

        System.out.println("--------------------------------------\n");

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

        System.out.println("Генерация записных книжек у каждого контакта.");
        System.out.println("--------------------------------------");

        for (Iterator<Owner> iterator = owners.iterator(); iterator.hasNext(); ) {
            Owner owner = iterator.next();
            System.out.println(owners.indexOf(owner) + " " + owner.getOwner() + ", тел.: " +
                    owner.getOwnerNumber() + ", " + owner.getOwnerOperator());
            List<Contact> phoneBooks = new ArrayList<>();
            phoneBooks = owner.getOwnerPhoneBook();
            System.out.println("--------------------------------------");
            for (Iterator<Contact> anotherIterator = phoneBooks.iterator(); anotherIterator.hasNext(); ) {
                Contact phoneBook = anotherIterator.next();
                System.out.println(phoneBooks.indexOf(phoneBook) + " " + phoneBook.getName() + ", тел.: " +
                        phoneBook.getPhoneNumber());
            }
            System.out.println("--------------------------------------");
        }

        System.out.println();
        System.out.println("Расчет наиболее часто встречающегося контакта с использованием списков запущен.");

        Instant startTime = Instant.now();
        System.out.println("Текущее время " + startTime.atZone(ZoneId.systemDefault()));

        int i = 0;
        for (Iterator<Owner> iterator = owners.iterator(); iterator.hasNext(); ) {
            Owner owner = iterator.next();
            System.out.print("Owner" + i + " counting...\r");       // Просто чтобы видеть, что процесс идет
            i++;
            for (Iterator<Owner> anotherIterator = owners.iterator(); anotherIterator.hasNext(); ) {
                Owner anotherOwner = anotherIterator.next();
                List<Contact> phoneBook = new ArrayList<>();
                phoneBook = anotherOwner.getOwnerPhoneBook();
                for (Iterator<Contact> bookIterator = phoneBook.iterator(); bookIterator.hasNext(); ) {
                    Contact contact = bookIterator.next();
                    if (owner.getOwnerNumber().equals(contact.getPhoneNumber())) {
                        owner.countIncrement();
                        break;
                    }
                }
            }
        }

        Collections.sort(owners);

        System.out.println();
        System.out.println("Расчет с использованием списков закончен.");
        Instant endTime = Instant.now();
        long secondsFrom = startTime.until(endTime,
                ChronoUnit.SECONDS);
        System.out.println("Текущее время " + endTime.atZone(ZoneId.systemDefault()));
        System.out.println("Расчет длился " + secondsFrom + " секунд.");
        System.out.println("Наиболее часто встречающийся контакт:");
        System.out.println(owners.get(peopleNumber - 1).getOwner() + ", тел.: " + owners.get(peopleNumber - 1).getOwnerNumber() +
                ", " + owners.get(peopleNumber - 1).getOwnerOperator());
        System.out.println("Контакт встречается " + owners.get(peopleNumber - 1).getCount() + " раз(a).\n");
        System.out.println("Список всех контактов по возрастанию количества их упоминания:\n");

        for (Iterator<Owner> iterator = owners.iterator(); iterator.hasNext(); ) {
            Owner owner = iterator.next();
            System.out.println(owners.indexOf(owner) + " " + owner.getOwner() + ", тел.: " +
                    owner.getOwnerNumber() + ", " + owner.getOwnerOperator() + ", контакт встречается "
                    + owner.getCount() + " раз(а).");
        }

        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Расчет наиболее часто встречающегося контакта с использованием массивов запущен.");

        startTime = Instant.now();
        System.out.println("Текущее время " + startTime.atZone(ZoneId.systemDefault()));

        i = 0;
        for (Owner owner : owners1) {
            System.out.print("Owner" + i + " counting...\r");
            i++;
            for (Owner anotherOwner : owners1) {
                List<Contact> phoneBook = new ArrayList<>();
                phoneBook = anotherOwner.getOwnerPhoneBook();
                for (Contact contact : phoneBook) {
                    if (owner.getOwnerNumber().equals(contact.getPhoneNumber())) {
                        owner.countIncrement();
                        break;
                    }
                }
            }
        }

        Arrays.sort(owners1);

        System.out.println();
        System.out.println("Расчет с использованием массивов закончен.");

        endTime = Instant.now();
        long secondsFrom2 = startTime.until(endTime,
                ChronoUnit.SECONDS);

        System.out.println("Текущее время " + endTime.atZone(ZoneId.systemDefault()));
        System.out.println("Расчет длился " + secondsFrom2 + " секунд.");
        System.out.println("Наиболее часто встречающийся контакт:");
        System.out.println(owners1[peopleNumber - 1].getOwner() + ", тел.: " + owners1[peopleNumber - 1].getOwnerNumber() +
                ", " + owners1[peopleNumber - 1].getOwnerOperator());
        System.out.println("Контакт встречается " + owners1[peopleNumber - 1].getCount() + " раз(a).\n");
        System.out.println("Список всех контактов по возрастанию количества их упоминания:\n");

        for (i = 0; i < owners1.length; i++) {
            System.out.println(i + " " + owners1[i].getOwner() + ", тел.: " +
                    owners1[i].getOwnerNumber() + ", " + owners1[i].getOwnerOperator() + ", контакт встречается "
                    + owners1[i].getCount() + " раз(а).");
        }

        System.out.println("--------------------------------------\n");
        System.out.println("Согласно обоим расчетам наиболее часто встречающийся контакт:");
        System.out.println(owners1[peopleNumber - 1].getOwner() + ", тел.: " + owners1[peopleNumber - 1].getOwnerNumber() +
                ", " + owners1[peopleNumber - 1].getOwnerOperator());
        System.out.println("Контакт встречается " + owners1[peopleNumber - 1].getCount() + " раз(a).\n");
        System.out.println("Расчет в списках длился " + secondsFrom + " секунд.");
        System.out.println("Расчет в массивах длился " + secondsFrom2 + " секунд.");
    }
}
