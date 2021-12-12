package Model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    @SerializedName("id")
    private int id;
    @SerializedName("moviename")
    private String moviename;
    @SerializedName("type")
    private String type;
    @SerializedName("director")
    private String director;
    @SerializedName("runtime")
    private int runtime;
    @SerializedName("realease_time")
    private String realease_time;
    @SerializedName("view")
    private int view;

    @Override
    public String toString() {
        return "Mã số: " + id + " - " +
                "Tên phim: " + moviename + " - " +
                "Thể loại: " + type + " - " +
                "Đạo diễn: " + director + " - " +
                "Thời lượng chiếu: " + runtime + " - " +
                "Thời gian ra mắt: " + realease_time + " - " +
                "Lượt xem: " + view;
    }

}
