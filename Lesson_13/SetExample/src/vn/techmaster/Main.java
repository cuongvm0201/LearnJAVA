package vn.techmaster;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Set<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(6);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        System.out.println(numbers);

        if(!numbers.add(9)){
            System.out.println("Đã có phần tử trong danh sách");
        } else {
            System.out.println("Thêm thành công");
        }
        System.out.println(numbers);

//        long count = numbers.stream().filter(i -> i%2==0).count();
//        System.out.println(count);

        
    }
}