package ua.bespalko.hw5;//Дан двумерный массив NxN(количество строк = количество столбцов), написать программу
//которая поменяет местами столбцы и строки.
//*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
//Изначальный массив не должен измениться

public class Task3 {
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Виведення початкового масиву у консоль
        System.out.println("Початковий масив:");
        printArray(originalArray);

        // Зміна місцями стовпців та рядків
        int[][] modifiedArray = swapRowsAndColumns(originalArray);

        // Виведення зміненого масиву у консоль
        System.out.println("Модифікований масив:");
        printArray(modifiedArray);
    }

    public static int[][] swapRowsAndColumns(int[][] originalArray) {
        int rows = originalArray.length;
        int columns = originalArray[0].length;

        // Створення нового масиву для змінених розмірів (кількість стовпців = кількість рядків)
        int[][] modifiedArray = new int[columns][rows];

        // Заповнення нового масиву елементами з початкового масиву у зміненому порядку
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                modifiedArray[j][i] = originalArray[i][j];
            }
        }

        return modifiedArray;
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
