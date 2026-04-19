package tna.cntt2.ontapgk2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityBMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút Tính Tổng
    public void XuLyBMI(View view){
        // Tìm tham chiếu đến điều khiển trên tập XML
        EditText editTextChieuCao = findViewById(R.id.edtChieuCao);
        EditText editTextSoCanNang = findViewById(R.id.edtCanNang);
        EditText editTextKQ = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về ở điều khiển số a
        String strA = editTextChieuCao.getText().toString();
        //Lấy dữ liệu về ở điều khiển số b
        String strB = editTextSoCanNang.getText().toString();
        //Chuyển dữ liệu sang số
        double soA = Double.parseDouble(strA);
        double soB = Double.parseDouble(strB);
        //Tính toán
        double kq = soB/(soA*soA);
        String strTong = String.valueOf(kq);
        //Xuất kết quả ra màn hình
        editTextKQ.setText(strTong);
    }
    public void QuayVe (View v) {
        //tao doi tuong intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhCHINH);
    }
}