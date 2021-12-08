package vn.techmaster;

import java.time.LocalDate;

public class SchoolBook extends Library {
    private int page;
    private String status;
    private int borrow;

    public SchoolBook(String name, String company, LocalDate date, int quanlity, int page, String status, int borrow) {
        super(name, company, date, quanlity);
        this.page = page;
        this.status = status;
        this.borrow = borrow;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getBorrow() {
        return borrow;
    }

    public void setBorrow(int borrow) {
        this.borrow = borrow;
    }

    public int inStock (){
        if (getQuanlity() > borrow){
        return super.getQuanlity() - borrow;}
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - " + "Số trang: " + page + " - " + "Tình trạng: " + status +  " - " +"Số lượng mượn: " + borrow + " - " + "Tồn kho: " + inStock();
    }
}
