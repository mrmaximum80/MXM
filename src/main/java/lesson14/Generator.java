package lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Generator {

    public static List<String> maleNames = new ArrayList<>();
    public static List<String> femaleNames = new ArrayList<>();
    public static List<String> malePatronymic = new ArrayList<>();
    public static List<String> femalePatronymic = new ArrayList<>();
    public static List<String> maleSurnames = new ArrayList<>();

    /**
     * Метод загружает списки мужских имен, женских имен, мужских отчеств, женских отчеств, а также мужских фамилий.
     *
     * @throws IOException
     */
    public void namesLoader() throws IOException {

        String str = "src\\main\\java\\lesson14\\names\\Male_names_short.txt";
        Path path = Path.of(str).toAbsolutePath();
        maleNames = Files.readAllLines(path);

        str = "src\\main\\java\\lesson14\\names\\female_names_rus.txt";
        path = Path.of(str).toAbsolutePath();
        femaleNames = Files.readAllLines(path);

        str = "src\\main\\java\\lesson14\\names\\Male_patronymic_short.txt";
        path = Path.of(str).toAbsolutePath();
        malePatronymic = Files.readAllLines(path);

        str = "src\\main\\java\\lesson14\\names\\female_patronymic_short.txt";
        path = Path.of(str).toAbsolutePath();
        femalePatronymic = Files.readAllLines(path);

        str = "src\\main\\java\\lesson14\\names\\male_surnames_rus.txt";
        path = Path.of(str).toAbsolutePath();
        maleSurnames = Files.readAllLines(path);
    }

    /**
     * Метод случайным образом возвращает названние мобильного оператора
     *
     * @return - название оператора
     */
    public String operatorGen() {
        int operator = (int) (Math.random() * 4);
        if (operator == MobileOperator.BEELINE.ordinal()) {
            return MobileOperator.BEELINE.getOperator();
        }
        if (operator == MobileOperator.MEGAFON.ordinal()) {
            return MobileOperator.MEGAFON.getOperator();
        }
        if (operator == MobileOperator.MTS.ordinal()) {
            return MobileOperator.MTS.getOperator();
        }
        return MobileOperator.TELE2.getOperator();
    }

    /**
     * Метод генерует случайный номер телефона следующим образом:
     * +7 задается сразу
     * - первые 3 цифры - на основании названия оператора из соответсвующего перечисления случайным образом берется один
     * из кодов, принадлежащий данному оператору
     * - следующие 3 цифры - гереруются случайным образом в интервале от 0 до 999
     * - последние 4 цифры берется номер объкта в списке, что сделано для того, чтобы однозначно избежать повторяющихся
     * номеров без необходимости дополнительных проверок (принято, что для более чем 10000 расчеты проводится не
     * будут)
     *
     * @param operator - название оператора связи
     * @param yyyy     - последние 4 цифры номера
     * @return
     */
    public String phoneNumberGen(String operator, int yyyy) {
        String phoneNumber = "+7 ";
        if (operator == MobileOperator.BEELINE.getOperator()) {
            phoneNumber += Integer.toString(MobileOperator.BEELINE.getCodes()[(int) (Math.random() * MobileOperator.BEELINE.getCodes().length)]) + " ";
        }
        if (operator == MobileOperator.MEGAFON.getOperator()) {
            phoneNumber += Integer.toString(MobileOperator.MEGAFON.getCodes()[(int) (Math.random() * MobileOperator.MEGAFON.getCodes().length)]) + " ";
        }
        if (operator == MobileOperator.MTS.getOperator()) {
            phoneNumber += Integer.toString(MobileOperator.MTS.getCodes()[(int) (Math.random() * MobileOperator.MTS.getCodes().length)]) + " ";
        }
        if (operator == MobileOperator.TELE2.getOperator()) {
            phoneNumber += Integer.toString(MobileOperator.TELE2.getCodes()[(int) (Math.random() * MobileOperator.TELE2.getCodes().length)]) + " ";
        }
        int xxx = (int) (Math.random() * 1000);
        if (xxx < 10) {
            phoneNumber += "00" + xxx + " ";
        } else {
            if (xxx < 100) {
                phoneNumber += "0" + xxx + " ";
            } else {
                phoneNumber += Integer.toString(xxx) + " ";
            }
        }
        if (yyyy < 10) {
            phoneNumber += "000" + yyyy;
        } else {
            if (yyyy < 100) {
                phoneNumber += "00" + yyyy;
            } else {
                if (yyyy < 1000) {
                    phoneNumber += "0" + yyyy;
                } else {
                    phoneNumber += Integer.toString(yyyy);
                }
            }
        }
        return phoneNumber;
    }

    /**
     * Метод генерирует список людей
     *
     * @param number - количество людей, которые необходимо сгенерировать
     * @return - список людей вида "ФИО - номер телефона - оператор связи"
     */
    public List<People> peopleGen(int number) {

        List<People> peoples = new ArrayList<>(number);
        String operator;

        for (int i = 0; i < number; i++) {
            People people = new People();
            people.setFio(fioGen());
            operator = operatorGen();
            people.setMobileOperator(operator);
            people.setPhoneNumber(phoneNumberGen(operator, i));
            peoples.add(people);
        }
        return peoples;
    }

    /**
     * Метод генерирует фамилию, имя имя и отчество
     *
     * @return - ФИО в виде одной строки
     */
    public String fioGen() {

        String name;
        if (new Random().nextBoolean()) {
            name = (maleNames.get((int) (Math.random() * maleNames.size())) + " " +
                    malePatronymic.get((int) (Math.random() * malePatronymic.size())) + " " +
                    maleSurnames.get((int) (Math.random() * maleSurnames.size())));
        } else {
            name = (femaleNames.get((int) (Math.random() * femaleNames.size())) + " " +
                    femalePatronymic.get((int) (Math.random() * femalePatronymic.size())) + " " +
                    femaleSurnameGen());
        }
        return name;
    }

    /**
     * Метод генерирует женскую фамилию на основании мужской
     *
     * @return - женская фамилия
     */
    public String femaleSurnameGen() {
        String femaleSurname = maleSurnames.get((int) (Math.random() * maleSurnames.size()));
        String end = femaleSurname.substring(femaleSurname.length() - 2);
        if (femaleSurname.substring(femaleSurname.length() - 2).equals("ов") ||
                femaleSurname.substring(femaleSurname.length() - 2).equals("ев") ||
                femaleSurname.substring(femaleSurname.length() - 2).equals("ин") ||
                femaleSurname.substring(femaleSurname.length() - 2).equals("ын")) {
            femaleSurname += "а";
        } else {
            if (femaleSurname.substring(femaleSurname.length() - 2).equals("ий") ||
                    femaleSurname.substring(femaleSurname.length() - 2).equals("ый") ||
                    femaleSurname.substring(femaleSurname.length() - 2).equals("ой")) {
                femaleSurname = femaleSurname.substring(0, femaleSurname.length() - 2) + "ая";
            }
        }
        return femaleSurname;
    }

    /**
     * Метод на основании списка людей генерирует список контактов с записными книжками
     *
     * @param peoples - список людей
     * @return - список контаков с записными книжками
     */
    public List<Owner> ownerGen(List<People> peoples) {

        List<Owner> owners = new ArrayList<>();
        for (Iterator<People> iterator = peoples.iterator(); iterator.hasNext(); ) {
            People people = iterator.next();
            Owner owner = new Owner();
            owner.setOwner(people.getFio());
            owner.setOwnerNumber(people.getPhoneNumber());
            owner.setOwnerOperator(people.getMobileOperator());
            List<Contact> phoneBook = new ArrayList<>();
            phoneBook = phoneBookGen(peoples, owner.getOwnerNumber());
            owner.setOwnerPhoneBook(phoneBook);
            owners.add(owner);
        }
        return owners;
    }

    /**
     * Метод генерирет записную книжку контакта таким образом, чтобы в ней не было повторяющихся номеров, для чего
     * создается дополнительный строковый список
     *
     * @param peoples    - список людей
     * @param ownerPhone - номер телефона контакта, для которого создается записная книжка
     * @return - контакт с записной книжкой
     */
    public List<Contact> phoneBookGen(List<People> peoples, String ownerPhone) {

        int contactNumber = (int) (Math.random() * 51 + 450);   //  51 + 450принимаем, что контактов в записной книжке будет от 50 до 500
        List<Contact> phoneBook = new ArrayList<>();
        int size = peoples.size();
        List<String> currentPhoneBook = new ArrayList<>(); // создаем дополнительный строковый список и добавлем в него
        currentPhoneBook.add(ownerPhone);                       // номер владельца, так как его точно не должно быть в его
        // телефонной книжке
        for (int i = 0; i < contactNumber; i++) {
            int value = (int) (Math.random() * size);           // выбираем, кого занести в записную книжку
            boolean check = false;

            // сравниваем выбранный номер с теми, что уже занесены. Если такого номера нет, то записываем,
            // если уже есть, то ищем другой номер
            for (Iterator<String> iterator = currentPhoneBook.iterator(); iterator.hasNext(); ) {
                String currentContact = iterator.next();
                if (peoples.get(value).getPhoneNumber().equals(currentContact)) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                Contact contact = new Contact();
                contact.setName(peoples.get(value).getFio());
                contact.setPhoneNumber(peoples.get(value).getPhoneNumber());
                contact.setOperator(peoples.get(value).getMobileOperator());
                currentPhoneBook.add(peoples.get(value).getPhoneNumber());
                phoneBook.add(contact);
            } else {
                i--;                        // сделано для того, чтобы получить именно столько контактов, сколько было
            }                               // задумано изначально, а не меньше, если будут совпадающие номера
        }
        return phoneBook;
    }
}
