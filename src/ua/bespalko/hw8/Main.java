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

