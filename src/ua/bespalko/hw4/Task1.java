package ua.bespalko.hw4;//Заполнить одномерный массив случайными целочисленными значениями.
//• Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
//400 элементов.
//P.S. значения элементов можно ограничить значениями 1-10 включительно.

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];

        // Заповнення масиву випадковими цілими числами в межах від 1 до 10
        fillArrayWithRandomValues(array);

        // Знаходження та виведення середнього арифметичного
        double arithmeticMean = calculateArithmeticMean(array);
        System.out.println("Середнє арифметичне: " + arithmeticMean);

        // Знаходження та виведення середнього геометричного
        double geometricMean = calculateGeometricMean(array);
        System.out.println("Середнє геометричне: " + geometricMean);
    }

    public static void fillArrayWithRandomValues(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    public static double calculateArithmeticMean(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    public static double calculateGeometricMean(int[] array) {
        double product = 1.0;

        for (int num : array) {
            product *= num;
        }

        return Math.pow(product, 1.0 / array.length);
    }
}
