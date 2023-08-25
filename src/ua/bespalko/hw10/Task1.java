package ua.bespalko.hw10;

//Task1
//
//Напишите Java-программу для обхода ArrayList с использованием:
//• цикла for,
//• for-each,
//• while,
//• итератора.

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Four");
        arrayList.add("Five");

        // Обход с использованием цикла for
        System.out.println("Обход с использованием цикла for:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // Обход с использованием цикла for-each
        System.out.println("\nОбход с использованием цикла for-each:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // Обход с использованием цикла while
        System.out.println("\nОбход с использованием цикла while:");
        int index = 0;
        while (index < arrayList.size()) {
            System.out.println(arrayList.get(index));
            index++;
        }

        // Обход с использованием итератора
        System.out.println("\nОбход с использованием итератора:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
