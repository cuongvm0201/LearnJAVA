package vn.techmaster;

public class Bmi {
    public void chiso(double cannang, double chieucao) {
        /* Bài 2 - Ý 1 */
        System.out.println("Bài Tâp 2 - Ý 1:");
        System.out.println("Cân nặng: " + cannang + " (kg)");
        System.out.println("Chiều cao: " + chieucao + " (m)");
        System.out.println("Chỉ số BMI: " + (cannang / (chieucao * chieucao)));
        System.out.println("******");
    }

        /* Bài 2 - ý 2 */
        public double chiso1(){
            double cannang = 75.5;
            double chieucao = 1.78;
            double bmi = cannang/(chieucao * chieucao);
            return bmi;
    }
        /* Bài 3 - Ý 3 */
        public double chiso2(double cannang, double chieucao){
            return cannang/(chieucao * chieucao);
    }

    /* So sánh 3 cách:
    +Cách thứ 1: chỉnh sửa giá trị tham số và in kết quả ra rất tiện nhưng không lưu dữ liệu trả về.
    +Cách thứ 2: lưu dữ liệu trả về nhưng muốn sửa giá trị tham số phải sửa trực
    tiếp trong code bất tiện.
    +Cách thứ 3: lưu dữ liệu trả về, có truyền tham số nên chỉ cần thay đổi tham
    số ở phần khai báo là sẽ thay đổi dữ liệu trả về, rất dễ kiểm soát đầu vào đầu ra.
    ==> Kết Luận: sử dụng cách thứ 1 và 3 chỉ cần viết phương thức 1 lần có thể in ra rất nhiều kết quả
    khác nhau của dữ liệu trả về tuy nhiên nếu muốn in tất cả tham số bên trong phương thức thì cách thứ 1 tiện hơn.
    */
}
