package vn.techmaster;

import java.time.LocalDate;

public class Library {
    private String id;
    private String name;
    private String company;
    private LocalDate date;
    private int quanlity;

    public Library(String name, String company, LocalDate date, int quanlity) {
        this.id = Util.generateId(5);
        this.name = name;
        this.company = company;
        this.date = date;
        this.quanlity = quanlity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    @Override
    public String toString() {
        return "Mã sách: " + id + " - " + "Tên sách: " + name + " - " + "Nhà xuất bản: " + company + " - " + "Ngày xuất bản: " + date + " - " + "Số lượng: " + quanlity;
    }
}
