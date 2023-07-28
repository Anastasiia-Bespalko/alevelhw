package ua.bespalko.hw2;//Определить является ли число четным или нет и вывести результат в консоль.

public class Task2 {
    public static void main(String[] args) {
        int number = 10;
        // Перевірка, чи є число парним
        boolean isEven = number % 2 == 0;
        // Виведення результату у консоль
        if (isEven) {
            System.out.println(number + " є парним.");
        } else {
            System.out.println(number + " не є парним.");
        }
    }
}
