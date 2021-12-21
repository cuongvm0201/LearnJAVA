public class Employee {
    private String id;
    private  String name;
    private  String email;
    private String sđt;
    private Long salary;

    public Employee(String name, String email, String sđt, Long salary) {
        this.id = Util.generateId(5) ;
        this.name = name;
        this.email = email;
        this.sđt = sđt;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSđt() {
        return sđt;
    }

    public Long getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSđt(String sđt) {
        this.sđt = sđt;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sđt='" + sđt + '\'' +
                ", salary=" + salary +
                '}';
    }
}
