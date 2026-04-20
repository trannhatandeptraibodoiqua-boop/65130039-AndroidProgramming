package thigk2.trannhatan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
    }

    // Hàm đáp ứng sự kiện nấn lên nút "Sang màn hình khác"
    // Xử lý chuyển màn hình
    public void ChuyenSoTien (View v) {
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this, ActivityChuyenTien.class);
        //Thuc hien chuyen
        startActivity(iManHinhKhac);
    }

    public void ChuyenBaiHat (View v) {
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this, ActivityBaiHat.class);
        //Thuc hien chuyen
        startActivity(iManHinhKhac);
    }

    public void ChuyenGioiThieu (View v) {
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhKhac = new Intent(this, ActivityGioiThieu.class);
        //Thuc hien chuyen
        startActivity(iManHinhKhac);
    }
}