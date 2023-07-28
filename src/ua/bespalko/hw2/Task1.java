package ua.bespalko.hw2;//Заданы плоские декартовы координаты треугольника. Например A(1, 5), B(3, 5), C(6, 7)
//        • Найти площадь треугольника и вывести в консоль.

public class Task1 {
    public static void main(String[] args) {
        // Координати вершин трикутника
        int x1 = 1, y1 = 5;
        int x2 = 3, y2 = 5;
        int x3 = 6, y3 = 7;
        // Обчислення площі трикутника
        double area = calculateTriangleArea(x1, y1, x2, y2, x3, y3);
        // Виведення результату у консоль
        System.out.println("Площа трикутника = " + area);
    }

    public static double calculateTriangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2)) / 2.0);
    }
}
