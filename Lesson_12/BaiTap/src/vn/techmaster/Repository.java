package vn.techmaster;

public class Repository {
    public static ServiceEmployee<Waiter> addWaiter() {
        ServiceEmployee<Waiter> listWaiter = new ServiceEmployee<>();
        listWaiter.add(new Waiter(1, "An", 20, 5000000, Type.Waiter, 2000000));
        listWaiter.add(new Waiter(2, "Bình", 21, 6000000, Type.Waiter, 1500000));
        listWaiter.add(new Waiter(3, "Cường", 22, 7000000, Type.Waiter,1200000));
        return listWaiter;
    }

    public static ServiceEmployee<Kitchen> addKitchen() {
        ServiceEmployee<Kitchen> listKitchen = new ServiceEmployee<>();
        listKitchen.add(new Kitchen(11, "Minh", 30, 8000000, Type.Kitchen, 4000000));
        listKitchen.add(new Kitchen(22, "Tuấn", 31, 9000000, Type.Kitchen, 3500000));
        listKitchen.add(new Kitchen(33, "Hoàng", 32, 10000000, Type.Kitchen, 3000000));
        return listKitchen;
    }
}
