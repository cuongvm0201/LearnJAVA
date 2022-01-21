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
    @SerializedName("title")
    private String title;
    @SerializedName("author")
    private String author;
    @SerializedName("category")
    private String [] category;
    @SerializedName("publishingYear")
    private int publishingYear;
    @SerializedName("publishingCompany")
    private String publishingCompany;
    @SerializedName("pageNumber")
    private int pageNumber;

    @Override
    public String toString() {
        return "Mã số: " + id + " - " +
                "Tên phim: " + title + " - " +
                "Thể loại: " + author + " - " +
                "Đạo diễn: " + category + " - " +
                "Thời lượng chiếu: " + publishingYear + " - " +
                "Thời gian ra mắt: " + publishingCompany + " - " +
                "Lượt xem: " + pageNumber;
    }

}


