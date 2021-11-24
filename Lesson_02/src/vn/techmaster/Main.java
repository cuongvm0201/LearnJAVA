package vn.techmaster;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Lấy ngày hiện tại
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println("Ngày Mai: " + today.plusDays(1));
        System.out.println("Tháng Sau: " + today.plusMonths(1));
        System.out.println("10 Năm Sau: " + today.plusYears(10));
        System.out.println("Tuần Sau: " + today.plusWeeks(3));
        System.out.println("Hôm Qua: " + today.minusDays(1));
        System.out.println("Lấy ngày hôm nay theo tháng: " + today.getDayOfMonth());
        System.out.println("Lấy ngày hôm nay theo tuần: " +today.getDayOfWeek());
        System.out.println("Lấy ngày trong năm " + today.getDayOfYear());
        System.out.println("Lấy tháng hiện tại: " + today.getMonthValue());
        System.out.println("Lấy tháng enum: " + today.getMonth());
        System.out.println("Lấy năm hiện tại: " + today.getYear());

        LocalDate currentDate = LocalDate.of(2021,11,19);
        System.out.println("Current date: " + currentDate);
        // Hoặc
        // Lấy mgày chỉ định
        int year = 2222;
        int month = 11;
        int day = 22;
        LocalDate currentDate1 = LocalDate.of(year, month, day);
        System.out.println("Current date: " + currentDate1);
        // Hoặc
        LocalDate date = LocalDate.of(2023, Month.JUNE, 30);
        System.out.println("date: " + date);
        // lấy ngày địa phương khác LocalDate.now(zoneID);

        // Lấy thời gian hiện tại
        LocalTime now = LocalTime.now();
        System.out.println("Bây giờ là: " + now);
        // Cộng trừ thời gian: tiếng - phút
        System.out.println("Sau 1 tiếng nữa là: " + now.plusHours(1));
        System.out.println("Sau 52 phút nữa là: " + now.plusMinutes(52));
        System.out.println("2 tiếng trước: " + now.minusHours(2));
        System.out.println("Lấy giờ hiện tại: " + now.getHour());
        System.out.println("Lấy phút hiện tại: " + now.getMinute());

        // Thời gian cụ thể
        LocalTime time = LocalTime.of(21,30, 22, 50);
        System.out.println("Thời gian chỉ định: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Ngày và giờ hiện tại: " + dateTime);
        LocalDateTime dateTime2 = LocalDateTime.of(date, time);
        System.out.println("Ngày và giờ hiện tại: " + dateTime2);

        LocalDateTime dateTime3 = LocalDateTime.of(2019,10,20,5,15);
        System.out.println("Tự truyền tham số datetime: " +dateTime3);

        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Định dạng lại ngày date: " + date.format(myformat));

        DateTimeFormatter myformatDateTime = DateTimeFormatter.ofPattern("hh:mm, dd/MM/yyyy");
        System.out.println("Định dạng ngày giờ dateTime3: " +dateTime3.format(myformatDateTime));




    }
}
