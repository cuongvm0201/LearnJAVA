package vn.techmaster;

import java.util.Scanner;

public class strName1 {
    public static void questFive1(){
        System.out.println("Nhập chuỗi bất kỳ: ");
        Scanner sc = new Scanner(System.in);
        String strRandom = sc.nextLine();
        if (isCheck(strRandom)){
            System.out.print("Chuỗi vừa nhập là palindrome\n");}
        else{
            System.out.print("Chuỗi vừa nhập không phải là palindrome\n");
        }
        }
    public static boolean isCheck(String strRandom){
        int i = 0;
        int j = strRandom.length() - 1;
        while (i < j)
        {
           if(strRandom.charAt(i) != strRandom.charAt(j))
           {return false;}
           i++;
           j--;
        }
            return true;
        }
}
