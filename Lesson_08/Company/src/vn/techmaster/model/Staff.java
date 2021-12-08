package vn.techmaster.model;

public class Staff {
    private int id;
    private String name;
    private int age;
    private String telephone;
    private String email;
    private long salary;

    public Staff(int id, String name, int age, String telephone, String email, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + id + " - " +
                "Tên nhân viên: " + name + " - " +
                "Tuổi: " + age + " - " +
                "Số diện thoại: " + telephone + " - " +
                "Email: " + email + " - " +
                "Lương cơ bản: " + salary;
    }

}
