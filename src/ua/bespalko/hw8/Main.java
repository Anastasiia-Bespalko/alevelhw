package ua.bespalko.hw8;

//Создать функциональный интерфейс Pow с методом pow(int number, int
//        pow), который принимает 2 параметра:
//        1 - число которое возводится в степень,
//        2 - степень в которую возводится число.
//
//        Реализовать этот интерфейс в методе main через лямбду (без использования
//        сторонних пакетов типа Math).

@FunctionalInterface
interface Pow {
    int pow(int number, int pow);
}

public class Main {
    public static void main(String[] args) {
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

