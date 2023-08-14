//package ua.bespalko.hw8;
//
////Создайте пример наследования, реализуйте класс Student и класс Aspirant,
////        аспирант отличается от студента наличием некой научной работы.
////        а) Класс Student содержит переменные: String firstName, lastName,
////        group. А также, double averageMark, содержащую среднюю оценку.
////        б) Создать метод getScholarship() для класса Student, который
////        возвращает сумму стипендии. Если средняя оценка студента равна 5, то
////        сумма 100 грн, иначе 80.
////        в) Переопределить этот метод в классе Aspirant. Если средняя оценка
////        аспиранта равна 5, то сумма 200 грн, иначе 180.
////        г) Создать массив типа Student, содержащий объекты класса Student и
////        Aspirant. Вызвать метод getScholarship() для каждого элемента массива.
////        Д)Переопределить методы equals() и hashCode() у студентов и
////        аспирантов. Сравнить несколько объектов по equals и hashcode.
//import java.util.Objects;
//public class Task1 {
//    public class Student {
//        private String firstName;
//        private String lastName;
//        private String group;
//        private double averageMark;
//
//        public Student(String firstName, String lastName, String group, double averageMark) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.group = group;
//            this.averageMark = averageMark;
//        }
//
//        public double getScholarship() {
//            return (averageMark == 5) ? 100 : 80;
//        }
//
//        public double getAverageMark() {
//            return averageMark;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Student)) return false;
//            Student student = (Student) o;
//            return Double.compare(student.averageMark, averageMark) == 0 &&
//                    firstName.equals(student.firstName) &&
//                    lastName.equals(student.lastName) &&
//                    group.equals(student.group);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(firstName, lastName, group, averageMark);
//        }
//    }
//
//    public class Aspirant extends Student {
//        private String scientificWork;
//
//        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
//            super(firstName, lastName, group, averageMark);
//            this.scientificWork = scientificWork;
//        }
//
//        @Override
//        public double getScholarship() {
//            return (getAverageMark() == 5) ? 200 : 180;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Aspirant)) return false;
//            if (!super.equals(o)) return false;
//            Aspirant aspirant = (Aspirant) o;
//            return Objects.equals(scientificWork, aspirant.scientificWork);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(super.hashCode(), scientificWork);
//        }
//    }
//
//    public class Main {
////        public static void main(String[] args) {
//            Student student1 = new Student("John", "Doe", "A1", 4.8);
//            Student student2 = new Student("Alice", "Smith", "B2", 5.0);
//
//            Aspirant aspirant1 = new Aspirant("Mike", "Johnson", "C3", 4.9, "Research Paper 1");
//            Aspirant aspirant2 = new Aspirant("Eva", "Brown", "D4", 5.0, "Research Paper 2");
//
//            Student[] students = {student1, student2, aspirant1, aspirant2};
//
//            for (Student student : students) {
//                System.out.println(student.getFirstName() + " " + student.getLastName() +
//                        " (" + student.getClass().getSimpleName() + "): Scholarship - " + student.getScholarship() + " грн");
//            }
//
//            // Сравнение объектов по equals и hashcode
//            System.out.println("Сравнение объектов:");
//            System.out.println(student1.equals(student2)); // false
//            System.out.println(aspirant1.equals(aspirant2)); // false
//            System.out.println(student2.equals(aspirant2)); // true (если удалим equals из Aspirant, вернет false)
//            System.out.println(student1.hashCode());
//            System.out.println(student2.hashCode());
//        }
//    }
//}
