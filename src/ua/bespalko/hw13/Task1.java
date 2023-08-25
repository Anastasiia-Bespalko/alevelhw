package ua.bespalko.hw13;

//Реализовать программу которая считывает текст с консоли и строит CSV файл.
//● Если пользователь ввел next то происходит переход строки
//● Если пользователь вводит end то программа завершается
//Пример ввода:
//hi there
//next
//hello
//next
//jesus
//end
//Пример результата:
//hi there,
//hello,
//jesus

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст (для завершения введите 'end'): ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } else if (input.equals("next")) {
                lines.add(""); // Добавляем пустую строку для перехода на следующую строку в CSV
            } else {
                lines.add(input);
            }
        }

        try {
            writeCSV(lines, "output.csv");
            System.out.println("Файл успешно создан.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла: " + e.getMessage());
        }
    }

    private static void writeCSV(List<String> lines, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : lines) {
                writer.write(line.replaceAll(",", "") + ",");
                writer.newLine();
            }
        }
    }
}
