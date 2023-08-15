package ua.bespalko.hw10;
//Реализовать утильный класс со статическими методами:
//• getSum(List<Integer> numbers) - возвращает сумму элементов списка
//• getOddNumber(List<Integer> numbers) - возвращает новый список нечетных чисел
//• convertToStringList(List<Integer> numbers) - возвращает новый список строк
//• doubling(List<String> strings) – возвращает новый список, в котором дублирует
//каждую строку и конкатенирует ее
//- input: “2i”
//- output: “2i2i”

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doubledStrings = new ArrayList<>();
        for (String str : strings) {
            doubledStrings.add(str + str);
        }
        return doubledStrings;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);

        System.out.println("Sum: " + getSum(numbers));

        List<Integer> oddNumbers = getOddNumber(numbers);
        System.out.println("Odd numbers: " + oddNumbers);

        List<String> stringList = convertToStringList(numbers);
        System.out.println("String list: " + stringList);

        List<String> doubledStrings = doubling(stringList);
        System.out.println("Doubled strings: " + doubledStrings);
    }
}
