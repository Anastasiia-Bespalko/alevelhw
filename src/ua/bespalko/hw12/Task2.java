package ua.bespalko.hw12;

//Реализовать класс-утилиту которая содержит два generic метода
//(статический и не статический):
//Метод 1: принимает любое значение и выводит ***{значение}***
//Метод 2: принимает массив любого типа и выводит его содержание
public class Task2 {
    // Статический метод для вывода значения
    public static <T> void printValue(T value) {
        System.out.println("***" + value + "***");
    }

    // Не статический метод для вывода содержания массива
    public <T> void printArray(T[] array) {
        System.out.print("Array content: [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        if (array.length > 0) {
            System.out.print(array[array.length - 1]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Использование статического метода для вывода значения
        Task2.printValue("Hello, world!");

        // Использование не статического метода для вывода содержания массива
        Integer[] intArray = {1, 2, 3, 4, 5};
        Task2 utils = new Task2();
        utils.printArray(intArray);
    }
}
