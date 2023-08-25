package ua.bespalko.hw5;//Заполнение двумерного массива значениями индекса (от 1 и до кол-ва элементов в
////массиве), при этом каждая вторая строка - отрицательными значениями.
////Например
////1 2 3
////-4 -5 -6
////7 8 9
////-10 -11 -12
////Передать массив в метод, заполнить данный массив
//

public class Task1 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;

        int[][] array = new int[rows][cols];
        fillArray(array);

        // Вывод массива в консоль
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void fillArray(int[][] array) {
        int value = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;

                if (i % 2 != 0) {
                    array[i][j] = -value;
                }

                value++;
            }
        }
    }
}
