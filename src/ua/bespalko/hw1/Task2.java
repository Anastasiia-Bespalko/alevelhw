package ua.bespalko.hw1;//int a =1;
//        int b =2;
//        Завдання поміняти дві змінні місцями, (зробити так щоб у b виявилася 1, а виявилася 2), не
//        використовуючи прямого присвоєння (тобто не можна написати b = 1; a = 2;).
//        Вивести результати а та b у консоль, до і після..

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("До: a=" + a + ", b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Після: a=" + a + ", b=" + b);
    }
}
