package ua.bespalko.hw4;//Заполнить одномерный массив случайными целочисленными значениями.
//• Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.

import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[1000];

        // Заповнення масиву випадковими цілими числами в межах від 1 до 1000
        fillArrayWithRandomValues(array, 1000);

        // Знаходження та виведення кількості простих чисел у масиві
        int primeCount = countPrimes(array);
        System.out.println("Кількість простих чисел у масиві: " + primeCount);
    }

    public static void fillArrayWithRandomValues(int[] array, int maxValue) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue) + 1;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int[] array) {
        int primeCount = 0;

        for (int num : array) {
            if (isPrime(num)) {
                primeCount++;
            }
        }

        return primeCount;
    }
}
