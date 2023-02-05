public class Strings {
    public static void main(String[] args) {
        Task1();
        System.out.println();
        Task2();
        System.out.println();
        Task3();
        System.out.println();
    }

    public static void Task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";

        System.out.println("ФИО сотрудника — " + lastName + firstName + middleName);
    }

    public static void Task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println(fullName.toUpperCase());
    }

    public static void Task3() {
        int testVar = 32;
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));
    }
}