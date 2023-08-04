package ua.bespalko.hw4;//Заполнить одномерный массив случайными целочисленными значениями.
//• Все четные значения заменить на нули. Размер массива - 2000 элементов.

import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[2000];

        // Заповнення масиву випадковими цілими числами в межах від 1 до 1000
        fillArrayWithRandomValues(array, 1000);

        // Заміна всіх парних значень на нулі
        replaceEvenWithZeros(array);

        // Виведення масиву у консоль
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void fillArrayWithRandomValues(int[] array, int maxValue) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue) + 1;
        }
    }

    public static void replaceEvenWithZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
    }
}
