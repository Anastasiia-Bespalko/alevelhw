package ua.bespalko.hw12;

//Создать обертку массива без дубликатов
//MySet
//- generic
//- заданный изначальный размер через конструктор
//- add() - проверка на наличие элемента в массиве и проверка на размер
//- get() - получение элемента по индексу
//- toString() - массив в строку

import java.util.Arrays;
public class MySet<T> {
    private Object[] array;
    private int size;

    public MySet(int initialSize) {
        if (initialSize < 0) {
            throw new IllegalArgumentException("Initial size cannot be negative.");
        }
        array = new Object[initialSize];
        size = 0;
    }

    public boolean add(T element) {
        if (contains(element)) {
            return false; // Element already exists, not added
        }
        if (size == array.length) {
            resizeArray();
        }
        array[size] = element;
        size++;
        return true; // Element added successfully
    }

    private void resizeArray() {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return (T) array[index];
    }

    private boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == null && element == null) {
                return true;
            }
            if (array[i] != null && array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            result.append(array[i]).append(", ");
        }
        result.append(array[size - 1]).append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        MySet<Integer> set = new MySet<>(5);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2); // Not added due to duplication
        set.add(4);
        set.add(5);

        System.out.println("Set: " + set);
        System.out.println("Element at index 2: " + set.get(2));
    }
}
