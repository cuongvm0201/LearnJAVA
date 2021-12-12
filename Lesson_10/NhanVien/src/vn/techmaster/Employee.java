package vn.techmaster;

public abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;


    public abstract int calculatorSalary();



    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String toString() {
        return "Tên nhân viên: " + name + " - " +
                "Lương / Giờ : " + paymentPerHour;
    }
}
