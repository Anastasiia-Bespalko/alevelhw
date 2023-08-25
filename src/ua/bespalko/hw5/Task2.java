package ua.bespalko.hw5;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {10, 8, 6, 4, 2};
        int[] array2 = {5, 8, 12, 18, 25};

        System.out.println("Массив 1 упорядочен по убыванию: " + checkDescendingOrder(array1));
        System.out.println("Массив 2 упорядочен по убыванию: " + checkDescendingOrder(array2));
    }

    public static boolean checkDescendingOrder(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
