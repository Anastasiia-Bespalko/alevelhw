package ua.bespalko.hw11;

//Напишите метод, который добавляет 100000 элементов в ArrayList и
//LinkedList. Напишите еще один метод, который выбирает из заполненного
//списка элемент наугад 100000 раз. Замерьте время, которое потрачено на
//это.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        long arrayListAddTime = measureAddTime(new ArrayList<>());
        long linkedListAddTime = measureAddTime(new LinkedList<>());

        System.out.println("Время добавления 100000 элементов в ArrayList: " + arrayListAddTime + " мс");
        System.out.println("Время добавления 100000 элементов в LinkedList: " + linkedListAddTime + " мс");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        fillList(arrayList, 100000);
        fillList(linkedList, 100000);

        long arrayListGetTime = measureGetTime(arrayList);
        long linkedListGetTime = measureGetTime(linkedList);

        System.out.println("Время выборки 100000 элементов из ArrayList: " + arrayListGetTime + " мс");
        System.out.println("Время выборки 100000 элементов из LinkedList: " + linkedListGetTime + " мс");
    }

    public static void fillList(List<Integer> list, int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt());
        }
    }

    public static long measureAddTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        fillList(list, 100000);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long measureGetTime(List<Integer> list) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
