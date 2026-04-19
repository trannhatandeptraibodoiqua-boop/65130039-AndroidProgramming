package tna.cntt2.ontapgk2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ActivityMonAn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mon_an);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Tìm List view
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
        // Chuẩn bị nguồn dữ liệu
        ArrayList<ChiTietMonActivity> dsMonAn = new ArrayList<ChiTietMonActivity>();
        dsMonAn.add(new ChiTietMonActivity("Cơm sườn tấm", 25000, "Đặc sản Nha Trang", R.drawable.cst));
        dsMonAn.add(new ChiTietMonActivity("Cơm gà", 30000, "Đặc sản Nha Trang", R.drawable.cg));
        dsMonAn.add(new ChiTietMonActivity("Cơm sườn bì", 27000, "Đặc sản Nha Trang", R.drawable.sb));
        //
        ChiTietMonAnAdapter adapter = new ChiTietMonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        //Bật xử lý sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                //Lấy phần tử đc chạm
                ChiTietMonActivity monAnChon = dsMonAn.get(i);
                //Làm gì đó
                Toast.makeText(ActivityMonAn.this,monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void QuayVe (View v) {
        //tao doi tuong intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhCHINH);
    }
}