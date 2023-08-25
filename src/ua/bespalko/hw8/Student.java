package ua.bespalko.hw8;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        return (averageMark == 5) ? 100 : 80;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.averageMark, averageMark) == 0 &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, group, averageMark);
    }
}
