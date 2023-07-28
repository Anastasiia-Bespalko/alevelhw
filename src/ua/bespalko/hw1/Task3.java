package ua.bespalko.hw1;//int a =5;
//        int b =3;
//        Завдання поміняти дві змінні місцями, (зробити так щоб b виявилася 5, а виявилася 3), не
//        використовуючи прямого присвоєння (тобто. не можна написати b = 5; a = 3;), А ТАКОЖ не можна
//        використовувати третю змінну.

public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("До: a=" + a + ", b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Після: a=" + a + ", b=" + b);
    }
}
