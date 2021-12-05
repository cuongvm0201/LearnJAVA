package vn.techmaster;

import java.util.ArrayList;

public class Controller {
    public static void newController (){
        ArrayList<Product> listItems = new ArrayList<>();
        listItems.add(new Product(1,"Iphone 11","Máy new 100%",110,13000000,"Hàng VNA"));
        listItems.add(new Product(2,"Iphone 12","Máy new 100%",80,16000000,"Hàng LLA"));
        listItems.add(new Product(3,"Iphone XSMax","Máy like new 99%",120,10000000,"Hàng VNA"));
        for (Product subProduct: listItems){
            System.out.println(subProduct);
        }
        System.out.println("Danh sách sản phẩm có số lượng tồn kho trên 100: ");
        for (int i=0; i < listItems.size();i++){
            if(listItems.get(i).getQuanlity() >= 100){
                System.out.println(listItems.get(i));
            }
        }
    }
}
