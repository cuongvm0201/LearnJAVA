package com.company.Model;

import com.company.Model.User;

import java.util.ArrayList;

public class Repository {
    public static ArrayList<User> getData() {
        ArrayList<User> listUser = new ArrayList<>();
        listUser.add(new User("cuongvm", "Cuong123@", "vmcuong2192@gmail.com"));
        listUser.add(new User("vmcuong", "Manhcuong123@", "vmcuong2193@gmail.com"));
        listUser.add(new User("cuong2192", "Cuongvu123@", "vmcuong2194@gmail.com"));
        listUser.add(new User("vmcuong2192", "Cuong1235@", "vmcuong2195@gmail.com"));
        listUser.add(new User("cuong.vm", "Cuong789!!!", "vmcuong2196@gmail.com"));
        return listUser;
    }
}
