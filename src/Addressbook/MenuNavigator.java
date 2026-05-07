package Addressbook;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuNavigator {

    private AddressBook addressBook = new AddressBook();
    boolean isRunning = true;

    public void start() {
        while (isRunning)
            selectMainMenu();
    }

    private void selectMainMenu() {

        System.out.println("Адресная книга");
        System.out.println("Выберете операцию: ");
        System.out.println("Вывести список контактов - выберете 1");
        System.out.println("Вывести выбранный контакт - выберете 2");
        System.out.println("Добавить контакт - выберете 3");
        System.out.println("Удалить контакт - выберете 4");
        System.out.println("Выход из программы - выберете 5");
        System.out.print("Введите значение: ");

        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1 -> printContacts();
            case 2 -> printContact(scanner);
            case 3 -> newContact(scanner);
            case 4 -> removeContact(scanner);
            case 5 -> exit();
            default -> System.out.println("Выбранно не верное значение. Повторите ввод");
        }

    }

    private void printContacts() {
        System.out.println(addressBook);
        System.out.println("___________________________");
    }

    private void printContact(Scanner scanner) {
        try {
            System.out.println("Выберете Id контакта: ");
            int numberOfContact = scanner.nextInt();
            Contact contact = addressBook.getContact(numberOfContact);
            if (contact != null) {
                System.out.println(contact);
            } else {
                System.out.println("Такого контакта не найдено");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите целое число (ID контакта)");
            scanner.nextLine();
        }

    }

    private void removeContact(Scanner scanner) {
        try {
            System.out.println("Выберете номер контакта: ");
            int numberOfContact = scanner.nextInt();
            addressBook.removeContact(numberOfContact);
            System.out.println("Контакт успешно удален");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Введите целое число (ID контакта)");
            scanner.nextLine();
        }

    }

    private void newContact(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Карточка создания контакта. Введите данные:");

        System.out.println("Введите ваше имя: ");
        String name = isNameLastNameValid(scanner);

        System.out.println("Введите вашу фамилию: ");
        String lastName = isNameLastNameValid(scanner);

        System.out.println("Введите ваш телефон: ");
        String phone = isPhoneNumberValid(scanner);

        System.out.println("Введите дату рождления в формате дд-мм-гггг: ");
        LocalDate birthday = parseData(scanner);

        boolean isValidNumber = true;
        while (isValidNumber) {
            System.out.println("Выберете пол. Выберете соответсвующее значение Мужской-1, Женский-2: ");
            try {
                int genderValue = scanner.nextInt();
                scanner.nextLine();
                if (genderValue == 1) {
                    System.out.println("Введите дату поступления зароботной платы в формате дд-мм-гггг: ");
                    LocalDate salaryDay = parseData(scanner);
                    addressBook.addContact(new manContact(name, lastName, phone, birthday, salaryDay));
                    isValidNumber = false;
                } else if (genderValue == 2) {
                    int amountKids = checkKidsCount(scanner);
                    addressBook.addContact(new womanContact(name, lastName, phone, birthday, amountKids));
                    isValidNumber = false;
                } else {
                    System.out.println("Не верный формат или число. Выберете значение");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите число 1 или 2");
                scanner.nextLine();
            }

        }

        System.out.println("Контакт успешно создан");
    }

    private LocalDate parseData(Scanner scanner) {
        LocalDate today = LocalDate.now();
        LocalDate formatDate;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        while (true) {
            try {
                String date = scanner.nextLine().strip();
                formatDate = LocalDate.parse(date, dateTimeFormatter);
                if (formatDate.plusYears(120).isBefore(today)) {
                    System.out.println("Слишком большое значение");
                    continue;
                }
                return formatDate;
            } catch (DateTimeParseException e) {
                System.out.println("Ошибка! Введите правильное значение даты в формате дд-ММ-гггг");
            }
        }
    }

    private String isPhoneNumberValid(Scanner scanner) {
        while (true) {
            String phone = scanner.nextLine().strip();
            if (phone.isEmpty() || phone == null) {
                System.out.println("Значение не может быть пустым");
                System.out.println("Введите номер телефона: ");
                continue;
            }
            String volumePhone = phone.replaceAll("[\\s\\-()+]", "");
            if (volumePhone.matches("\\d{10,12}")) {
                return volumePhone;
            }
            System.out.println("телефон должен состоять из 10-12 цифр");
        }
    }

    private int checkKidsCount(Scanner scanner) {
        while (true) {
            System.out.println("Введите количество детей: ");
            try {
                int amountKids = scanner.nextInt();
                scanner.nextLine();
                if (0 <= amountKids && amountKids <= 20) {
                    return amountKids;
                }
                System.out.println("Не верное количество детей");
            } catch (InputMismatchException e) {
                System.out.println("Ошибка! Введите целое число");
                scanner.nextLine();
            }
        }
    }

    private String isNameLastNameValid(Scanner scanner) {
        while (true) {
            String name = scanner.nextLine().strip();
            if (name.isEmpty()) {
                System.out.println("Значение не может быть пустым");
                System.out.println("Введите ваше значение: ");
                continue;
            }
            if (name.matches("^[A-ZА-Я][a-zа-я]{1,30}$")) {
                return name;
            }
            System.out.println("Значение должно начинаться с заглавной буквы и содержать только буквы");
        }


    }

    private void exit() {
        System.out.println("Завершение программы...");
        isRunning = false;
    }
}
