package ru.baskakov;

import java.util.Scanner;

public class ContactManager {
    private static final int MAX_CAP_ARRAY = 3;
    private static final String SPLITTER = "=============================================================";
    static String[] nameArray = new String[MAX_CAP_ARRAY];
    static String[] phoneArray = new String[MAX_CAP_ARRAY];
    static int countContact = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println(SPLITTER);
            System.out.println("""
                    Доброе пожаловать в Систему Учета Контактов:
                    Выберите дальнейшее действие, указав цифру из меню:
                    1. Добавить контакт
                    2. Просмотреть контакты
                    3. Найти контакт
                    4. Удалить контакт
                    5. Выйти
                    """);
            System.out.println(SPLITTER);
            System.out.println("Укажите номер пункта меню:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    showContacts();
                    break;
                case 3:
                    searchContact(scanner);
                    break;
                case 4:
                    // TODO добавить вызов метода для удаления контактов
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Некорректный ввод, введите цифру пункта меню!");
                    break;
            }
        }
    }

    private static void addContact(Scanner scanner) {
        if (countContact >= MAX_CAP_ARRAY) {
            System.out.println("Список контактов переполнен! Сперва удалите запись!");
            return;
        }
        System.out.println("Введите имя контакта:");
        String name = scanner.next();
        nameArray[countContact] = name;
        System.out.println("Введите номер контакта:");
        String phone = scanner.next();
        phoneArray[countContact] = phone;
        countContact++;
        System.out.println("Контакт успешно добавлен!");
        System.out.println(countContact);
    }

    private static void showContacts() {
        System.out.println(SPLITTER);
        System.out.println("Список контактов:");
        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i] != null) {
                System.out.printf("%d. Name: %s\n", i + 1, nameArray[i]);
            }
        }
        System.out.println(SPLITTER);
    }

    private static void searchContact(Scanner scanner) {
        System.out.println(SPLITTER);
        System.out.println("Введите имя для поиска:");

        StringBuilder contactInfo = new StringBuilder();
        String name = scanner.next();
        boolean found = false;

        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i] == null) {
                continue;
            }
            if (nameArray[i].equals(name)) {
                contactInfo.append((i + 1))
                        .append(". Name: ")
                        .append(nameArray[i])
                        .append(", Phone: ")
                        .append(phoneArray[i])
                        .append("\n");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Запрашиваемый контакт не найден!");
        } else {
            System.out.println(contactInfo);
        }

        System.out.println(SPLITTER);
    }
}