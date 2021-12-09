import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(1,"Cường", LocalDate.now(),"vmcuong2192@gmail.com","0945940246");
        System.out.println(p.getName());
    }
}
