package com.company;

public class Person {
    private String id;
    private String name;
    private String email;
    private String mobile;
    private long salary;

    public Person(String id, String name, String email, String mobile, long salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.salary = salary;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Mã: " + id + " - " +
                "Tên: " + name + " - " +
                "Email: " + email + " - " +
                "SĐT: " + mobile + " - " +
                "Lương: " + salary;
    }
}
