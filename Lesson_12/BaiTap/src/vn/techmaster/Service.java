package vn.techmaster;



public class Service {
    ServiceEmployee<Waiter> listWaiter;
    ServiceEmployee<Kitchen> listKitchen;
    public void printWaiter() {
        listWaiter = Repository.addWaiter();
        System.out.println("Danh sách nhân viên bàn: ");
        listWaiter.display();
    }

    public void printKitchen() {
        listKitchen = Repository.addKitchen();
        System.out.println("Danh sách nhân viên bếp: ");
        listKitchen.display();
    }

    public void printAll (){
        System.out.println("Danh sách tất cả nhân viên: ");
        listWaiter = Repository.addWaiter();
        listKitchen = Repository.addKitchen();
        listWaiter.display();
        listKitchen.display();
    }
}

