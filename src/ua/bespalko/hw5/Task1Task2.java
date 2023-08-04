package ua.bespalko.hw5;//Заполнение двумерного массива значениями индекса (от 1 и до кол-ва элементов в
//массиве), при этом каждая вторая строка - отрицательными значениями.
//Например
//1 2 3
//-4 -5 -6
//7 8 9
//-10 -11 -12
//*Передать массив в метод, заполнить данный массив

//Проверить заданный массив на упорядоченность по убыванию.
//*передать массив в метод, получить boolean

public class Task1Task2 {
    public static void main(String[] args) {
        int rows = 4; // Кількість рядків
        int columns = 3; // Кількість стовпців

        int[][] array = new int[rows][columns];

        fillArrayWithValues(array);

        // Виведення масиву у консоль
        System.out.println("Масив:");
        printArray(array);

        // Перевірка на упорядкованість у порядку зменшення
        int[] oneDimensionalArray = {10, 8, 5, 3, 1}; // Упорядкований у порядку зменшення

        // Виведення одновимірного масиву у консоль
        System.out.println("Одновимірний масив:");
        printArray(oneDimensionalArray);

        // Перевірка на упорядкованість у порядку зменшення
        boolean isSorted = isSortedDescending(oneDimensionalArray);
        System.out.println("Масив упорядкований у порядку зменшення: " + isSorted);
    }

    public static void fillArrayWithValues(int[][] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value++;
            }
            if (i % 2 == 1) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] *= -1;
                }
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}



