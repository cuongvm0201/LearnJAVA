import java.time.LocalDate;
import java.util.ArrayList;

public class AddCustomer {
    public ArrayList<Customer> getData(){
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer((listCustomer.size()+1),"Cường", LocalDate.of(1992,1,2),Gender.Male,"Hà Nội","0945940246","cuong@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Trang", LocalDate.of(1991,5,5),Gender.Female,"Hồ Chí Minh","0945940247","trang@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Hoài", LocalDate.of(1994,7,22),Gender.Female,"Hồ Chí Minh","0945550247","thuhoai@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Tuấn", LocalDate.of(1994,5,21),Gender.Male,"Hà Nam","0945645347","tuanrong@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Nghĩa", LocalDate.of(1990,8,31),Gender.Male,"Vĩnh Phúc","0945659347","nghia@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Dung", LocalDate.of(1989,2,22),Gender.Female,"Bắc Ninh","0943445347","dungdung@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Phương", LocalDate.of(1998,6,30),Gender.Female,"Bắc Giang","0935995347","phuong123@gmail.com"));
        return listCustomer;
    }
}
