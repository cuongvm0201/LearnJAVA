package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer[] intArr = new Integer[2];
        intArr[0] = 1;
        intArr[1] = 2;
        MyArray<Integer> m = new MyArray<>(intArr);
        m.printArr(intArr);

        Double[] doubleArr = new Double[2];
        doubleArr[0] = 1.1;
        doubleArr[1] = 2.2;
        MyArray<Double> m1 = new MyArray<>(doubleArr);
        m1.printArr(doubleArr);

        Boolean[] booleanArr = new Boolean[2];
        booleanArr[0] = false;
        booleanArr[1] = false;
        MyArray<Boolean> m2 = new MyArray<>(booleanArr);
        m2.printArr(booleanArr);

        String[] stringArr = new String[2];
        stringArr[0] = "abc";
        stringArr[1] = "abcd";
        MyArray<String> m3 = new MyArray<>(stringArr);
        m3.printArr(stringArr);

    }

}
