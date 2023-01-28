import java.time.LocalDate;

public class Main {

    /* Задача 1
    Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
    */

    public static boolean checkLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    public static void printYear(int year) {
        if (checkLeapYear(year)) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    /* Задача 2
    Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
    Если устройство старше текущего года, предложите ему установить облегченную версию.
    Текущий год можно получить таким способом:    int currentYear = LocalDate.now().getYear();
    Или самим задать значение вручную — ввести в переменную числовое значение.
    В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
    */
    public static void recommendOSInstall(int typeOS, int deviceYear) {

        int currentYear = LocalDate.now().getYear();
        if (typeOS == 0 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (typeOS == 0 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (typeOS == 1 && deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (typeOS == 1 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    /* Задача 3
    Возвращаемся к задаче на расчет дней доставки банковской карты.
    Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.
    */

    public static int calculateDeliveryDays(int distance) {

        int deliveryDays = 0;

        if (distance < 20) {
            deliveryDays = 1;
        } else if (distance < 60) {
            deliveryDays = 2;
        } else if (distance < 100) {
            deliveryDays = 3;
        }
        return deliveryDays;
    }

    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1");

        int year = 2015;
        printYear(year);

        System.out.println();

        //Задача 2
        System.out.println("Задача 2");

        int deviceYear = 2023;
        recommendOSInstall(0, deviceYear);
        recommendOSInstall(1, deviceYear);

        System.out.println();

        //Задача 3
        System.out.println("Задача 3");

        int distance = 60;
        int deliveryDays = calculateDeliveryDays(distance);

        if (deliveryDays == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней на доставку: " + deliveryDays);
        }

        System.out.println();
    }
}