package vn.techmaster;

import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Caculator c = new Caculator();
        c.pheptinh(22, 11);


        Bmi m = new Bmi();
        m.chiso(78.5,1.72);
        double y2 = m.chiso1();
        System.out.println("Bài Tập 2 - Ý 2");
        System.out.println("Chỉ số BMI: " + y2);
        System.out.println("******");
        double y3 = m.chiso2(82.3,1.91);
        System.out.println("Bài Tập 2 - Ý 3");
        System.out.println("Chỉ số BMI: " + y3);

    }

}
