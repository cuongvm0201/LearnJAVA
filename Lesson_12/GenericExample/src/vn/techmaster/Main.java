package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("abc");
//
//
//        for (int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
        ClassGeneric<String> strGeneric = new ClassGeneric<>("Cường");
        System.out.println(strGeneric.getObj());

        ClassGeneric<Double> doubleGeneric = new ClassGeneric<>(5.6);
        System.out.println(doubleGeneric.getObj());

        Integer [] intArr = new Integer[5];
        for ( int i = 0; i < intArr.length; i++){
            intArr[i] = i;
        }
        printArray(intArr);
        System.out.println();

        Double [] doubleArr = new Double[5];
        for ( int i = 0; i < doubleArr.length; i++){
            doubleArr[i] = i + 0.5;
        }
        printArray(doubleArr);
        System.out.println();

        String [] stringArr = new String[5];
        for ( int i = 0; i < stringArr.length; i++){
            stringArr[i] = "array-" + i;
        }
        printArray(stringArr);
        System.out.println();
        PairGeneric<Integer, String> person1 = new PairGeneric<>(1,"Cường");


        PairGeneric<String, String> person2 = new PairGeneric<>("01","Thái");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("HTML");
        strList.add("CSS");

        printList(strList);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        printList(intList);
    }

    public static <E> void printArray(E[] arr){
        for (E element: arr){
            System.out.print(element + "\t");
        }
    }

    public static void printList (ArrayList<?> arr){
        for (Object obj: arr){
            System.out.println(obj);
        }
    }
}
