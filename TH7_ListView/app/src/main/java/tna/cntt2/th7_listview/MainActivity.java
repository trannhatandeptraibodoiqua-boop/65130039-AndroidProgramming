package tna.cntt2.th7_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Hiển thị dữ liệu lên ListView
        //B1+: Cần có dữ liệu
        // ?? từ đâu có: từ cơ sở dữ liệu (SQL, noSQL, XML,...)
        // ở bài này chúng ta hard-code trực tiếp
        // cần biến phù hợp để chứa dữ liệu
        ArrayList<String> dsTenTinhThanhVN; //khai báo
        dsTenTinhThanhVN = new ArrayList<String>(); // tạo thể hiện cụ thể, xin mới
            // thêm dữ liệu ở đây (đúng ra ta phải đọc từ 1 nguồn)
            // nhưng ta hard-code (cho sẵn để demo)
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        //B2. Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);

        //B3. Gắn vào điều khiển hiện thị ListView
        //3.1 Tìm
        ListView lvTenTinhThanh =  findViewById(R.id.lvDanhSachTT);
        //3.2 Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 Lắng nghe và xử lý sự kiện user tương tác
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}