package ua.bespalko.hw6;//Найти и исправить ошибку в коде с помощью дебаггера
//ошибка на строке No21,Тут помилка в циклі for. При виконанні цього циклу, замість перебору елементів внутрішнього масиву triangle[i], умова i < triangle[i].length неправильно використовує змінну i.

//public class Task2 {
//    public static void main(String[] args) {
//        int[][] triangle = new int[5][];
//        triangle[0] = new int[1];
//        triangle[1] = new int[2];
//        triangle[2] = new int[3];
//        triangle[3] = new int[4];
//        triangle[4] = new int[5];
//        for (int i = 0; i < triangle.length; i++) {
//            System.out.println(triangle.length + "!");
//            System.out.println("i = " + i);
//            for (int j = 0; j < triangle[i].length; j++) {
//                System.out.println(triangle[i].length);
//                triangle[i][j] = 0;
//            }
//        }
//
//        for (int i = 0; i < triangle.length; i++) {
//            for (int j = 0; j < triangle[i].length; j++) {
//                System.out.print(triangle[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

public class Task2 {
    public static void main(String[] args) {
        int[][] triangle = new int[5][];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];
        for (int i = 0; i < triangle.length; i++) {
            System.out.println(triangle.length + "!");
            System.out.println("i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.println(triangle[i].length);
                triangle[i][j] = 0;
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; i < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
