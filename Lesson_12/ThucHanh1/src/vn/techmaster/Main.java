package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        PersonModel<Student> pe = new PersonModel<>();
        pe.add(new Student(1,"Cường",20));
        pe.add(new Student(2,"Thái",20));
        pe.display();

        PersonModel<Employee> pe1 = new PersonModel<>();
        pe1.add(new Employee(11,"Cường Vũ",11000000));
        pe1.add(new Employee(22,"Thái Pro",21000000));
        pe1.display();
    }
}
