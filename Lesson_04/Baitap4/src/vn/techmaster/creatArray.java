package vn.techmaster;

import java.util.Scanner;

public class creatArray {
    public static void actionArray(){
//        Tạo mảng chuỗi gồm n phần tử (n nhập vào từ bàn phím):
//       -Nhập thông tin cho các phần tử.
//       -In thông tin ra màn hình.
//       -Đếm số lần “Java” xuất hiện trong mảng.
//       -Nhập vào từ bàn phím chuỗi bất kỳ, kiểm tra chuỗi đó ở vị trí nào của mảng.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        String [] Array = new String[n];
        for (int i = 0; i < n ; i++){
            System.out.printf("Phần tử mảng vị trí %s: ", i);
            Array[i] = sc.next();
        }
        System.out.println("--------------------------");
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(Array[i]);
        }
        int countstr = 0;
            for (int i = 0; i < n ; i++){
            if(Array[i].contains("Java")){
                countstr++;
            }
            }
        System.out.println("Số lần Java xuất hiện trong mảng là: "+countstr);
        System.out.println("--------------------------");
        System.out.println("Nhập chuỗi bất kỳ: ");
        String strRandom = sc.next();
        int isCheck = 0;
            for (int i = 0; i < n ; i++)
            {
                if (strRandom.equals(Array[i]))
                {
                    isCheck++;
                    System.out.println("Chuỗi vừa nhập nằm ở vị trí: " + i);

                }
            }
             if(isCheck == 0)
        {
            System.out.println("Chuỗi vừa nhập không có trong mảng");
        }
        sc.close();
    }
}
