package vn.techmaster;

public class FullTimeEmployee extends Employee {
    private final int a = 8;

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public int calculatorSalary() {
        return getPaymentPerHour()*a;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Số giờ làm việc thực té: "+ a + " - " + "Lương thực lĩnh: " + calculatorSalary();
    }
}
