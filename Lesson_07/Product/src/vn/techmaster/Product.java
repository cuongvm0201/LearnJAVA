package vn.techmaster;

public class Product {
    private int idNumber;
    private String name;
    private String content;
    private int quanlity;
    private long price;
    private String type;

    public Product(int idNumber, String name, String content, int quanlity, long price, String type) {
        this.idNumber = idNumber;
        this.name = name;
        this.content = content;
        this.quanlity = quanlity;
        this.price = price;
        this.type = type;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Service{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", quanlity=" + quanlity +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
