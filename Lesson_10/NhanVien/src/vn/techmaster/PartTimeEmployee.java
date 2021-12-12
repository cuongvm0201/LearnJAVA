package vn.techmaster;

public class PartTimeEmployee extends Employee {
    private final int workingHours = 10;

    public PartTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculatorSalary(){
        return workingHours*getPaymentPerHour();
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Số giờ làm việc thực té: "+ workingHours + " - " + "Lương thực lĩnh: " + calculatorSalary();
    }
}
