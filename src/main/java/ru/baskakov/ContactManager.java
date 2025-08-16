package ru.baskakov;

import java.util.Scanner;

public class ContactManager {
    private static final int MAX_CAP_ARRAY = 100;
    private String[] nameArray = new String[MAX_CAP_ARRAY];
    private String[] phoneArray = new String[MAX_CAP_ARRAY];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("""
                    =============================================================
                    Доброе пожаловать в Систему Учета Контактов:
                    Выберите дальнейшее действие, указав цифру из меню:
                    1. Добавить контакт
                    2. Просмотреть контакты
                    3. Найти контакт
                    4. Удалить контакт
                    5. Выйти
                    =============================================================
                    """);
            System.out.println("Укажите номер пункта меню:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // TODO добавить вызов метода для добавления контактов
                    break;
                case 2:
                    // TODO добавить вызов метода для просмотра контактов
                    break;
                case 3:
                    // TODO добавить вызов метода для поиска контактов
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

}