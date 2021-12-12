package vn.techmaster;

public class Goods {
    public int idNumber;
    public String name;
    public String content;
    public int quanlity;
    public long price;
    public String type;

    public Goods(int idNumber, String name, String content, int quanlity, long price, String type) {
        this.idNumber = idNumber;
        this.name = name;
        this.content = content;
        this.quanlity = quanlity;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + idNumber + "\n" +
                "Tên sản phẩm: " + name + "\n" +
                "Thông tin sản phẩm: " + content + "\n" +
                "Số lượng: " + quanlity + "\n" +
                "Giá bán: " + price + "\n" +
                "Loại sản phẩm: " + type;
    }
}
