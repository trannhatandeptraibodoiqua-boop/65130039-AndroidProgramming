package tna.cntt2.ontapgk;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> ketQuaList;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Tham chiếu đếnListView
        listView = findViewById(R.id.listView);
        // Khởi tạo danh sách và adapte1r
        ketQuaList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ketQuaList);
        listView.setAdapter(adapter);
    }

    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Chuyển lên
    public void ChuyenLen(View view){
        //Tìm, tham chiếu đến điều khiển trên tệp XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        //Lấy dữ liệu về ở điều khiển số b
        String strB = editTextSoB.getText().toString();
        //Chuyển dữ liệu sang dạng số
        double so_B = Double.parseDouble(strB);
        //Tính toán theo yêu cầu
        double len = so_B * 2.54;
        String strLen = String.valueOf(len); //Chuyển sang dạng chuỗi
        //Hiện ra màn hình
        editTextSoA.setText(strLen);

        // Thêm kết quả vào đầu danh sách
        ketQuaList.add(0, so_B + " inches = " + strLen + " cm");
        adapter.notifyDataSetChanged();
    }

    public void ChuyenXuong(View view){
        //Tìm, tham chiếu đến điều khiển trên tệp XML
        EditText editTextSoA = findViewById(R.id.edtA);
        EditText editTextSoB = findViewById(R.id.edtB);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextSoA.getText().toString();
        //Chuyển dữ liệu sang dạng số
        double so_A = Double.parseDouble(strA);
        //Tính toán theo yêu cầu
        double xuong = so_A / 2.54;
        String strXuong = String.valueOf(xuong); //Chuyển sang dạng chuỗi
        //Hiện ra màn hình
        editTextSoB.setText(strXuong);

        // Thêm kết quả vào đầu danh sách
        ketQuaList.add(0, so_A + " cm = " + strXuong + " inches");
        adapter.notifyDataSetChanged();
    }
}