package ua.bespalko.hw8;

public class Task2 { public static void main(String[] args) {
            // Реализация функционального интерфейса Pow через лямбда-выражение
     Pow powFunction = (number, pow) -> {
                int result = 1;
                for (int i = 0; i < pow; i++) {
                    result *= number;
                }
                return result;
            };

            // Пример использования
            int base = 2;
            int exponent = 5;
            int result = powFunction.pow(base, exponent);
            System.out.println(base + " в степени " + exponent + " = " + result);
        }
    }