package ua.bespalko.hw7;


import java.util.Random;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector crossProduct(Vector other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Vector(newX, newY, newZ);
    }

    public double cosAngleWith(Vector other) {
        double scalarProduct = x * other.x + y * other.y + z * other.z;
        double lengthProduct = getLength() * other.getLength();
        return scalarProduct / lengthProduct;
    }

    public Vector add(Vector other) {
        double newX = x + other.x;
        double newY = y + other.y;
        double newZ = z + other.z;
        return new Vector(newX, newY, newZ);
    }

    public Vector subtract(Vector other) {
        double newX = x - other.x;
        double newY = y - other.y;
        double newZ = z - other.z;
        return new Vector(newX, newY, newZ);
    }

    public static Vector[] generateRandomVectors(int n) {
        Random random = new Random();
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Vector(x, y, z);
        }
        return vectors;
    }

    public static void main(String[] args) {
        Vector vector1 = new Vector(1.0, 2.0, 3.0);
        Vector vector2 = new Vector(4.0, 5.0, 6.0);

        System.out.println("Длина вектора 1: " + vector1.getLength());
        System.out.println("Длина вектора 2: " + vector2.getLength());

        Vector crossProduct = vector1.crossProduct(vector2);
        System.out.println("Векторное произведение: " + crossProduct.x + ", " + crossProduct.y + ", " + crossProduct.z);

        double cosAngle = vector1.cosAngleWith(vector2);
        System.out.println("Косинус угла между векторами: " + cosAngle);

        Vector sumVector = vector1.add(vector2);
        System.out.println("Сумма векторов: " + sumVector.x + ", " + sumVector.y + ", " + sumVector.z);

        Vector diffVector = vector1.subtract(vector2);
        System.out.println("Разность векторов: " + diffVector.x + ", " + diffVector.y + ", " + diffVector.z);

        int N = 5;
        Vector[] randomVectors = Vector.generateRandomVectors(N);
        System.out.println("Массив случайных векторов:");
        for (Vector vector : randomVectors) {
            System.out.println(vector.x + ", " + vector.y + ", " + vector.z);
        }
    }
}

