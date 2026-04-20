package thigk2.trannhatan;

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

public class ActivityBaiHat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_hat);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Tìm List view
        ListView lvDSBaiHat = (ListView) findViewById(R.id.lvDSBaiHat);
        // Chuẩn bị nguồn dữ liệu
        ArrayList<ChiTietBaiHatActivity> dsBaiHat = new ArrayList<ChiTietBaiHatActivity>();
        dsBaiHat.add(new ChiTietBaiHatActivity("Trần Nhật An", "Ca khúc đặc biệt", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Cô gái Pako", "Ca khúc cách mạng", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Cô gái mở đường", "Ca khúc cách mạng", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Tàu anh qua núi", "Ca khúc cách mạng", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Đất nước", "Ca khúc cách mạng", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Tình ca Tây Bắc", "Ca khúc cách mạng", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Những ánh sao đêm", "Ca khúc cách mạng", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Đường Trường Sơn", "Ca khúc cách mạng", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Tiểu đội xe không kính", "Ca khúc cách mạng", R.drawable.baihat));
        dsBaiHat.add(new ChiTietBaiHatActivity("Chào anh giải phóng quân", "Ca khúc cách mạng", R.drawable.baihat));
        //
        ChiTietBaiHatAdapter adapter = new ChiTietBaiHatAdapter(this, dsBaiHat);
        lvDSBaiHat.setAdapter(adapter);
        //Bật xử lý sự kiện
        lvDSBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                //Lấy phần tử đc chạm
                ChiTietBaiHatActivity monAnChon = dsBaiHat.get(i);
                //Làm gì đó
                Toast.makeText(ActivityBaiHat.this,monAnChon.getTenBaiHat(),Toast.LENGTH_SHORT).show();
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