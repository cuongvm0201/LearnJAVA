package vn.techmaster;

import java.util.ArrayList;

public class MyArray <E> {
    public E[] newArr;

    public MyArray(E[] newArr) {
        this.newArr = newArr;
    }

    public E[] getNewArr() {
        return newArr;
    }

    public void setNewArr(E[] newArr) {
        this.newArr = newArr;
    }

    public void printArr (E[] newArr){
        for(E e:newArr){
            System.out.println(e);
        }
    }
}
