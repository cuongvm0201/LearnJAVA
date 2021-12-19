package vn.techmaster.AllService;


import vn.techmaster.Model.Kitchen;
import vn.techmaster.Model.Repository;
import vn.techmaster.Model.Waiter;
import vn.techmaster.Model.Type;

import java.util.Scanner;

public class Service {
    ServiceEmployee<Waiter> listWaiter = Repository.addWaiter();
    ServiceEmployee<Kitchen> listKitchen = Repository.addKitchen();
    Scanner sc = new Scanner(System.in);

    public void printWaiter() {
        System.out.println("Danh sách nhân viên bàn: ");
        listWaiter.display();
    }

    public void printKitchen() {
        System.out.println("Danh sách nhân viên bếp: ");
        listKitchen.display();
    }


    public void printAll() {
        System.out.println("Danh sách tất cả nhân viên: ");
        listWaiter.display();
        listKitchen.display();
    }

    public void insertNewEmployee() {
        System.out.println("Thêm nhân viên mới: ");
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập lương cơ bản: ");
        long basicSalary = Long.parseLong(sc.nextLine());
        System.out.println("Nhập 1 để chọn nhân viên bàn" + "\n" + "Nhập 2 để chọn nhân viên bếp");
        int choose = Integer.parseInt(sc.nextLine());
        Type type = getType(choose);
         if (choose == 1) {
             System.out.println("Nhập tiền tip: ");
             long compensate = Long.parseLong(sc.nextLine());
             Waiter newWaiter = new Waiter(id, name, age, basicSalary, type, compensate);
             listWaiter.add(newWaiter);
             System.out.println("Thêm thành công nhân viên bàn");
             System.out.println("Danh sách nhân viên bàn sau khi thêm: ");
             listWaiter.display();
         }else if (choose == 2) {
             System.out.println("Nhập tiền lương dịch vụ: ");
             long serviceCharge = Long.parseLong(sc.nextLine());
             Kitchen newKitchen = new Kitchen(id, name, age, basicSalary, type, serviceCharge);
             listKitchen.add(newKitchen);
             System.out.println("Thêm thành công nhân viên bếp");
             System.out.println("Danh sách nhân viên bếp sau khi thêm: ");
             listKitchen.display();
         }
    }


    public Type getType(int choose) {
        Type type = null;
        boolean isContinue = false;
        while (!isContinue) {
            if (choose == 1) {
                isContinue = true;
                type = Type.Waiter;
            } else if (choose == 2) {
                isContinue = true;
                type = Type.Kitchen;
            } else {
                System.out.println("Error!!!");
            }
        }
        return type;
    }

}

