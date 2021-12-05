package vn.techmaster.dataFilm;

import java.util.ArrayList;

public class addFilm {
    public static ArrayList<newFilm> getFilm(){
        ArrayList<newFilm> listFilm = new ArrayList<>();
        listFilm.add(new newFilm(1,"CHỦNG TỘC BẤT TỬ","Action, "+"Adventure",155,"Chloé Zhao",2021));
        listFilm.add(new newFilm(2,"SHANG-CHI VÀ HUYỀN THOẠI THẬP LUÂN","Action",136,"Destin Daniel Cretton",2021));
        listFilm.add(new newFilm(3,"SUICIDE SQUAD: ĐIỆP VỤ CẢM TỬ","Action",132,"James Gunn",2021));
        listFilm.add(new newFilm(4,"HỐ SÂU TỬ THẦN","Horror",89,"Bradley Parker",2021));
        listFilm.add(new newFilm(5,"ÂM HỒN NHẬP XÁC","Horror",120,"Banjong Pisanthanakun",2021));
        listFilm.add(new newFilm(6,"CẦU HỒN","Horror",88,"Simon Barrett",2021));
        listFilm.add(new newFilm(7,"HIỆN THÂN TÀ ÁC","Horror",111,"James Wan",2021));
        listFilm.add(new newFilm(8,"THE CONJURING: MA XUI QUỶ KHIẾN","Horror",112,"Michael Chaves",2021));
        listFilm.add(new newFilm(9,"VỆ SĨ SÁT THỦ 2: NHÀ CÓ NÓC","Fun",118,"Patrick Hughes",2021));
        listFilm.add(new newFilm(10,"THIÊN THẦN HỘ MỆNH","Mentality",124,"Victor Vũ",2021));
        return listFilm;
    }
}
