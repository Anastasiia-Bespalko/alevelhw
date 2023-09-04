package ua.bespalko.hw11;

//Реализовать метод, принимающий список строк и возвращающий Map, где
//ключ - строка, значение - количество букв в строке.
//Пример:
//[“тут”, “там”, “стол”] -> [ {“тут”, 3}, {“там”, 3}, {“стол”, 4}]

import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class Task2 {
    public static Map<String, Integer> countStringLengths(List<String> strings) {
        Map<String, Integer> result = new HashMap<>();

        for (String str : strings) {
            int length = str.length();
            result.put(str, length);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> strings = List.of("тут", "там", "стол");
        Map<String, Integer> lengthMap = countStringLengths(strings);

        for (Map.Entry<String, Integer> entry : lengthMap.entrySet()) {
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }
    }
}
