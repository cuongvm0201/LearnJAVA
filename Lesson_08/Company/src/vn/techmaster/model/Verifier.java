package vn.techmaster.model;

public class Verifier extends Staff {
    private int findBug;
    private int salaryPerbug = 50000;

    public Verifier(int id, String name, int age, String telephone, String email, long salary, int findBug) {
        super(id, name, age, telephone, email, salary);
        this.findBug = findBug;
    }

    public int getFindBug() {
        return findBug;
    }

    public void setFindBug(int findBug) {
        this.findBug = findBug;
    }


    public long allSalary() {
        return getSalary() + this.findBug * salaryPerbug;
    }


    @Override
    public String toString() {
        return super.toString() + " - " + "Số lỗi tìm được: " + findBug + " - " + "Lương thực lĩnh: " + allSalary();
    }


}
