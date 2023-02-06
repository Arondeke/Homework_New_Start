import java.time.LocalDate;

public class Methods {
    public static void main(String[] args) {
        countLeapYear(2024);
        printCommandToDownloadApplication((byte) 0, 2020);

        int days = countDeliveryDays(130);
        if (days > 3) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней:" + days);
        }
    }

    public static void countLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printCommandToDownloadApplication(byte clientOS, int yearOfDevice) {
        int currentYear = LocalDate.now().getYear();
        String versionOS = "a";
        String ageVersionOS = "б";
        if (clientOS == 0) {
            versionOS = "iOS";
        } else if (clientOS == 1) {
            versionOS = "Android";
        }
        if (yearOfDevice <= currentYear) {
            ageVersionOS = "лайт ";
        } else {
            ageVersionOS = "";
        }
        System.out.println("Установите " + ageVersionOS + "версию приложения для " + versionOS + " по ссылке");
    }

    public static int countDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays = deliveryDays + 1;
        }
        if (deliveryDistance > 60) {
            deliveryDays = deliveryDays + 1;
        }
        if (deliveryDistance > 100) {
            deliveryDays = deliveryDays + 1;
        }
        return deliveryDays;
    }
}
