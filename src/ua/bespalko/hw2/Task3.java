package ua.bespalko.hw2;//Вывести на экран меньшее по модулю из трёх вещественных чисел.
//Вывести число, не модуль.

public class Task3 {
    public static void main(String[] args) {
        double num1 = 13;
        double num2 = -7;
        double num3 = 3;

        double minModulus = findMinModulus(num1, num2, num3);
        System.out.println("Меньший по модулю элемент: " + minModulus);
    }

    public static double findMinModulus(double num1, double num2, double num3) {
        double absNum1 = Math.abs(num1);
        double absNum2 = Math.abs(num2);
        double absNum3 = Math.abs(num3);

        if (absNum1 <= absNum2 && absNum1 <= absNum3) {
            return num1;
        } else if (absNum2 <= absNum1 && absNum2 <= absNum3) {
            return num2;
        } else {
            return num3;
        }
    }
}

