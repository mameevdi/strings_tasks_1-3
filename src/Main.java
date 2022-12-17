public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1"); //вывести в консоль ФИО
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName+firstName+middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {
        System.out.println("Задача 2"); //преобразовать все знаки в строке в верхний регистр
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName+firstName+middleName;
        String toUCFullName = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + toUCFullName);
    }

    public static void task3() {

        System.out.println("Задача 3"); //написать программу, которая заменяет символ «ё» на символ «е»
        String fullName = "Иванов Семён Семёнович";
        String nameWithoutYo = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + nameWithoutYo);
    }
}