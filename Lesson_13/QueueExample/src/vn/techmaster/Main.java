package vn.techmaster;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.offer("HTML");
        queue.add("JS");
        queue.offer("Ruby");

//        System.out.println(queue);
//
//        System.out.println(queue.remove()); //Nếu trong danh sách không có phần tử nào nèm ra ngoại lệ Exception
//        System.out.println(queue);
//
//        System.out.println(queue.poll()); //Nếu không có phần tử nào, trả về null
//        System.out.println(queue);
//
//        System.out.println(queue.element()); //Lấy ra phần tử đầu tiên, nếu danh sách rỗng ném ra ngoại lệ
//
//        System.out.println(queue.peek()); //Nếu không có phần tử nào, trả về null

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println("phần tử đầu tiên: "+ numbers.remove());
        System.out.println(numbers);

        numbers.add(2);
        System.out.println(numbers);

        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("Thái");
        strings.add("Cường");
        strings.add("Khải");
        strings.add("Tuấn");

        System.out.println(strings);
    }
}
