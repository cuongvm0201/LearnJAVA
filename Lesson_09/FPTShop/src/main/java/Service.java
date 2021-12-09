import java.util.ArrayList;

public class Service {

    public ArrayList<Product> addProduct() {
        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product(Util.generateId(5), "Iphone 11", "Bộ nhớ 64GB", new String[]{"Điện thoại", "Apple"}, 20, 13000000));
        listProduct.add(new Product(Util.generateId(5), "Laptop Asus", "Hàng nhập khẩu", new String[]{"Laptop"}, 50, 22000000));
        listProduct.add(new Product(Util.generateId(5), "Màn hình Dell", "Kích thước màn 24inc", new String[]{"Phụ kiện"}, 15, 4000000));
        listProduct.add(new Product(Util.generateId(5), "Tai nghe Sony", "Kết nối không dây", new String[]{"Phụ kiện"}, 10, 2000000));
        return listProduct;
    }

    public void printProduct(ArrayList<Product> listProduct) {
        for (Product p : listProduct) {
            System.out.println(p);
        }
    }


}
