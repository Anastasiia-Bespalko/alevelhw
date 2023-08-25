package ua.bespalko.hw8;

import java.util.Objects;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        return (getAverageMark() == 5) ? 200 : 180;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aspirant)) return false;
        if (!super.equals(o)) return false;
        Aspirant aspirant = (Aspirant) o;
        return Objects.equals(scientificWork, aspirant.scientificWork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), scientificWork);
    }
}

