package thigk2.trannhatan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityChuyenTien extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuyen_tien);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính Tổng
    public void XuLyChuyenTien(View view){
        // Tìm tham chiếu đến điều khiển trên tập XML
        EditText editTextChieuCao = findViewById(R.id.edtVNĐ);
        EditText editTextKQ = findViewById(R.id.edtDola);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextChieuCao.getText().toString();
        //Lấy dữ liệu về ở điều khiển số b
        //Chuyển dữ liệu sang số
        double soA = Double.parseDouble(strA);
        //Tính toán
        double kq = soA / 26337;
        String strDola = String.valueOf(kq);
        //Xuất kết quả ra màn hình
        editTextKQ.setText(strDola);
    }
    public void QuayVe (View v) {
        //tao doi tuong intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhCHINH);
    }
}