package tna.cntt2.th7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterViewFlipper;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN; //khai báo
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
            //đã chuyển ra ngoài khai báo
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
        //gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Tạo bộ lắng nghe và xử lý sự kiện OnClickItem, đặt vào 1 biến
    // vd: BoLangNghevaXL
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Code xử lý dữ liệu
            // i là vị trí phần tử vừa được click
            // ví dụ xử lý ở đây, là hiện lên màn hình 1 thông báo nhanh về vị trí của phần tử vừa chọn
            //vd khác, thay vì hiện vị trí, ta hiện giá trị
            // lấy giá trị của phần tử thứ i
            String strTenTinhChon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this, strTenTinhChon, Toast.LENGTH_LONG).show();
        }
    };
}