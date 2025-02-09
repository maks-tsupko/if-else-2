public class Main {
    public static void main(String[] args) {
        // задача 1
        System.out.println("задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // задача 2
        System.out.println("задача 2");
        int versionOS = 1;
        int clientDeviceYear = 2017;
        if (versionOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (versionOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (versionOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (versionOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // задача 3
        System.out.println("задача 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год " + year + " высокосный");
        } else {
            System.out.println("Год " + year + " не являктся высокосным");
        }
        // задача 4
        System.out.println("задача 4");
        int deliveryDistance = 95;
        int oneDayDelivery = 1;
        int twoDayDelivery = 2;
        int treeDayDelivery = 3;
        if (deliveryDistance < 20) {
            System.out.println("Доставка в пределах 20 км - " + oneDayDelivery + " сутки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка в пределах от 20 км до 60 км - " + treeDayDelivery + " суток");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Доставка в пределах 60 км до 100 км - " + treeDayDelivery + " суток");
        } else if (deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
        // задача 5
        System.out.println("задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Сейчас Зима");
                break;
            case 3, 4, 5:
                System.out.println("Сейчас Весна");
                break;
            case 6, 7, 8:
                System.out.println("Сейчас Лето");
                break;
            case 9, 10, 11:
                System.out.println("Сейчас Осень");
                break;
            default:
                System.out.println("Ошибка !");
        }


    }


    }

