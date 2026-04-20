package thigk2.trannhatan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ActivityDanhNhan extends AppCompatActivity {
    ChiTietDanhNhanAdapter danhNhanAdapter;
    ArrayList<ChiTietDanhNhanActivity> recyclerViewDatas;
    RecyclerView recyclerViewDanhNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_danh_nhan);

        //3
        recyclerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewDanhNhan = findViewById(R.id.recyclerDanhNhan);
        //5
        //RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        //recyclerViewLandscape.setLayoutManager(layoutLinear);
        //RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        //recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 1);
        recyclerViewDanhNhan.setLayoutManager(layoutGrid);
        //6
        danhNhanAdapter = new ChiTietDanhNhanAdapter(this, recyclerViewDatas);
        //7
        recyclerViewDanhNhan.setAdapter(danhNhanAdapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    ArrayList<ChiTietDanhNhanActivity> getDataForRecyclerView() {
        ArrayList<ChiTietDanhNhanActivity> dsDuLieu = new ArrayList<ChiTietDanhNhanActivity>();

        dsDuLieu.add(new ChiTietDanhNhanActivity("an", "Trần Nhật An"," Nha Trang"));
        dsDuLieu.add(new ChiTietDanhNhanActivity("", "Lê Hồng Phong","Hà Nội"));
        dsDuLieu.add(new ChiTietDanhNhanActivity("", "Nguyễn Trãi","Hồ Chí Minh"));

        return dsDuLieu;
    }

    public void QuayVe (View v) {
        //tao doi tuong intent
        //Tham số thứ 2 của ham tạo này, là tên Activity ( màn hình ) ta muốn chuyển sang
        Intent iManHinhCHINH = new Intent(this, MainActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhCHINH);
    }
}