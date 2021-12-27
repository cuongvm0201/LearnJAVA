package vn.techmaster;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static class Student{
        public double point;
        public void myPoint (){
            System.out.println(point);
        }

        public Student(double point) {
            this.point = point;
        }

        public double getPoint() {
            return point;
        }

        public void setPoint(double point) {
            this.point = point;
        }
    }
}
