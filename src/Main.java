import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        startTask();
        System.out.println("Задача №1");
        int enterYear = 2024;
        checkLeapYear(enterYear);
        endTask();
        startTask();
        System.out.println("Задача №2");
        recommendAppVersion(0, 2013);
        endTask();
        startTask();
        System.out.println("Задача №3");
        countDeliveryDays(95);
        endTask();

    }

    public static void startTask() {
        System.out.println();
        System.out.println("————————————————————————————————————————————————————————");
    }
    public static void endTask() {
        System.out.println("————————————————————————————————————————————————————————");
    }
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println(year + " год — високосный год");
        } else {
        System.out.println(year + " год — невисокосный год");
        }
    }
    public static void recommendAppVersion (int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("облегченную версию ");
        }
        System.out.print("для ");
        if (clientOS == 0) {
            System.out.print("IOS по ссылке");
            System.out.println();
        } else {
            System.out.print("Android по ссылке");
            System.out.println();
        }
    }
    private static boolean isDeviceOld (int yearOfCreate) {
        int currentYear = LocalDate.now().getYear();
        return yearOfCreate <= currentYear;
    }


    public static int countDeliveryDays(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60) {
            result++;
        }
        if (deliveryDistance > 100) {
            result = -1;
        }
        System.out.println("Срок доставки: " + result + " д.");

        return result;

    }
}



