package ua.bespalko.hw4;//Заполнить одномерный массив случайными целочисленными значениями.
//• Все четные значения заменить на нули. Размер массива - 2000 элементов.

import java.util.Random;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[2000];

        // Заполнение массива случайными целыми числами в диапазоне от 1 до 1000
        fillArrayWithRandomValues(array, 1000);

        // Замена всех четных значений на нули и получение модифицированного массива
        int[] modifiedArray = replaceEvenWithZeros(array);

        // Вывод модифицированного массива в консоль
        for (int num : modifiedArray) {
            System.out.print(num + " ");
        }
    }

    public static void fillArrayWithRandomValues(int[] array, int maxValue) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue) + 1;
        }
    }

    public static int[] replaceEvenWithZeros(int[] array) {
        int[] copiedArray = array.clone();

        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 2 == 0) {
                copiedArray[i] = 0;
            }
        }
        return copiedArray;
    }
}

