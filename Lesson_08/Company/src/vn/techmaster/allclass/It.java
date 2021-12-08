package vn.techmaster.allclass;

public class It extends Staff {
    private int overTime;
    private int salaryOvertime = 200000;

    public It(int id, String name, int age, String telephone, String email, long salary, int overTime) {
        super(id, name, age, telephone, email, salary);
        this.overTime = overTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public long allSalary() {
        return getSalary() + this.overTime * salaryOvertime;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Thời gian làm thêm: " + overTime + " - " + "Lương thực lĩnh: " + allSalary();
    }
}
