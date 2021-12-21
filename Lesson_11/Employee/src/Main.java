import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Employee> newEmployee = new ArrayList<>();
        System.out.println("Nhập tên: ");
        String name = Validate.checkName();
        System.out.println("Nhập email: ");
        String email = Validate.checkEmail();
        System.out.println("Nhập số đt: ");
        String phone = Validate.checkphone();
        System.out.println("Nhập lương: ");
        Long salary = Long.parseLong(sc.nextLine());
        Employee em = new Employee(name, email, phone, salary);
//        newEmployee.add(em);
        System.out.println(em);

    }
}
