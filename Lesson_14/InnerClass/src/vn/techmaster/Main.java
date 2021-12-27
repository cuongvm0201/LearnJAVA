package vn.techmaster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//        Person.Student student = new Person.Student(10 );
//
//        Car car = new Car() {
//            @Override
//            public void setName() {
//                System.out.println("GetZ");
//            }
//        };
//
//        car.setName();
//
//        ITeacher teacher = () -> {
//            System.out.println("Ngọc");
//            System.out.println("in cho vui");
//        };
//
//        teacher.getName();
//
//
//
//
//        System.out.println("\n");
//

//        Collections.sort(animals, new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        animals.forEach(animal -> System.out.println(animal));
//        animals.sort((o1, o2) -> o1.getAge() - o2.getAge());
//        animals.forEach(animal -> System.out.println(animal));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);

        ArrayList<Double> newNumbers = new ArrayList<>();
        newNumbers.add(5.5);
        newNumbers.add(4.4);
        newNumbers.add(3.3);

        numbers.stream().map(i -> i*10).forEach(i -> System.out.println(i));
        System.out.println();
        numbers.stream().filter(i -> i%2==0).forEach(i -> System.out.print(i+"\t"));
        System.out.println();
        numbers.stream().limit(3).forEach(i -> System.out.print(i+"\t"));
        System.out.println();
        numbers.stream().skip(2).forEach(i-> System.out.print(i+"\t"));
        System.out.println();
        numbers.stream().sorted().forEach(i-> System.out.print(i+"\t"));
        System.out.println();
        Integer min = numbers.stream().min(Integer::compare).get();
        System.out.println("Phần tử nhỏ nhất: "+ min);

        Animal a1 = new Animal("Dog",5,"Black");
        Animal a2 = new Animal("Cat",1,"White");
        Animal a3 = new Animal("Horse",2,"Black");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.stream().filter(i -> i.getAge() < 2).forEach(i -> System.out.println(i));
    }
}
