package ua.bespalko.hw7;


    import java.util.Random;

    public class Task2 {
        private double x;
        private double y;
        private double z;

        public Task2(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        // Метод вычисления длины вектора
        public double getLength() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        // Метод вычисления векторного произведения с другим вектором
        public Task2 crossProduct(Task2 other) {
            double newX = y * other.z - z * other.y;
            double newY = z * other.x - x * other.z;
            double newZ = x * other.y - y * other.x;
            return new Task2(newX, newY, newZ);
        }

        // Метод вычисления косинуса угла между векторами
        public double cosAngleWith(Task2 other) {
            double scalarProduct = x * other.x + y * other.y + z * other.z;
            double lengthProduct = getLength() * other.getLength();
            return scalarProduct / lengthProduct;
        }

        // Метод для суммы векторов
        public Task2 add(Task2 other) {
            double newX = x + other.x;
            double newY = y + other.y;
            double newZ = z + other.z;
            return new Task2(newX, newY, newZ);
        }

        // Метод для разности векторов
        public Task2 subtract(Task2 other) {
            double newX = x - other.x;
            double newY = y - other.y;
            double newZ = z - other.z;
            return new Task2(newX, newY, newZ);
        }

        // Статический метод для генерации массива случайных векторов размером N
        public static Task2[] generateRandomVectors(int N) {
            Random random = new Random();
            Task2[] vectors = new Task2[N];
            for (int i = 0; i < N; i++) {
                double x = random.nextDouble();
                double y = random.nextDouble();
                double z = random.nextDouble();
                vectors[i] = new Task2(x, y, z);
            }
            return vectors;
        }

        public static void main(String[] args) {
            // Пример использования методов класса
            Task2 vector1 = new Task2(1.0, 2.0, 3.0);
            Task2 vector2 = new Task2(4.0, 5.0, 6.0);

            System.out.println("Длина вектора 1: " + vector1.getLength());
            System.out.println("Длина вектора 2: " + vector2.getLength());

            Task2 crossProduct = vector1.crossProduct(vector2);
            System.out.println("Векторное произведение: " + crossProduct.x + ", " + crossProduct.y + ", " + crossProduct.z);

            double cosAngle = vector1.cosAngleWith(vector2);
            System.out.println("Косинус угла между векторами: " + cosAngle);

            Task2 sumVector = vector1.add(vector2);
            System.out.println("Сумма векторов: " + sumVector.x + ", " + sumVector.y + ", " + sumVector.z);

            Task2 diffVector = vector1.subtract(vector2);
            System.out.println("Разность векторов: " + diffVector.x + ", " + diffVector.y + ", " + diffVector.z);

            int N = 5;
            Task2[] randomVectors = Task2.generateRandomVectors(N);
            System.out.println("Массив случайных векторов:");
            for (Task2 vector : randomVectors) {
                System.out.println(vector.x + ", " + vector.y + ", " + vector.z);
            }
        }
    }

