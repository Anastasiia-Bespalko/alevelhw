package ua.bespalko.hw9;
//Создайте класс с двумя методами f( ) и g( ). В g( ) выбросите исключение
//1. В f( ) вызовите g( ), поймайте его исключение и, в блоке catch, выбросите
//другое исключение
//2. Проверьте ваш код в main( ).
public class Task2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Перехвачено исключение в main: " + e.getMessage());
        }
    }

    public static void f() throws Exception {
        try {
            g();
        } catch (IllegalArgumentException e) {
            throw new Exception("Исключение в методе f: " + e.getMessage());
        }
    }

    public static void g() {
        throw new IllegalArgumentException("Исключение в методе g");
    }
}
