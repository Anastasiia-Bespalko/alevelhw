package ua.bespalko.hw6;//Класс Phone.
//а) Создайте класс Phone, который содержит переменные(поля) number,
//model и weight.
//б) Добавить конструктор в класс Phone, который принимает на вход
//три параметра для инициализации переменных класса - number, model
//и weight.
//в) Добавить конструктор, который принимает на вход два параметра
//для инициализации переменных класса - number, model.
//г) Добавить конструктор без параметров.
//д) Создайте три экземпляра этого класса.
//ж) Присвоить значения полям класса.
//з) Выведите на консоль значения их полей.
//и) Добавить в класс Phone методы: receiveCall, имеет один параметр
//– имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
//getNumber – возвращает номер телефона. Вызвать эти методы для
//каждого из объектов.

public class Phone {
        private String number;
        private String model;
        private double weight;

        // Конструктор с тремя параметрами
        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        // Конструктор с двумя параметрами
        public Phone(String number, String model) {
            this.number = number;
            this.model = model;
        }

        // Конструктор без параметров
        public Phone() {
        }

        // Метод receiveCall
        public void receiveCall(String callerName) {
            System.out.println("Звонит " + callerName);
        }

        // Метод getNumber
        public String getNumber() {
            return number;
        }

        public static void main(String[] args) {
            // Создание трех экземпляров класса Phone
            Phone phone1 = new Phone("123456789", "Samsung Galaxy S21", 0.2);
            Phone phone2 = new Phone("987654321", "iPhone 13");
            Phone phone3 = new Phone();

            // Присвоение значений полям класса для phone3
            phone3.number = "111222333";
            phone3.model = "Xiaomi Redmi Note 10";
            phone3.weight = 0.3;

            // Вывод на консоль значений полей для каждого экземпляра класса Phone
            System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.model + ", " + phone1.weight);
            System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.model + ", " + phone2.weight);
            System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.model + ", " + phone3.weight);

            // Вызов метода receiveCall для каждого объекта
            phone1.receiveCall("John");
            phone2.receiveCall("Alice");
            phone3.receiveCall("Bob");

            // Вызов метода getNumber для каждого объекта
            System.out.println("Phone 1 number: " + phone1.getNumber());
            System.out.println("Phone 2 number: " + phone2.getNumber());
            System.out.println("Phone 3 number: " + phone3.getNumber());
        }

}
