package vn.techmaster;

import java.time.LocalDate;

public class Teacher extends Person {
    private long salary;

    public Teacher(String name, LocalDate date, String address, long salary) {
        super(name, date, address);
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Lương: " + salary;
    }
}
