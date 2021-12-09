import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private String id;
    private String name;
    private String description;
    private String[] category;
    private int quanlity;
    private long price;

    @Override
    public String toString() {
        return "Mã sản phẩm: " + id + " - " +
                "Tên sản phẩm: " + name + " - " +
                "Thông tin: " + description + " - " +
                "Danh mục: " + Arrays.toString(category) + " - " +
                "Số lượng: " + quanlity + " - " +
                "Giá bán: " + price ;
    }
}
