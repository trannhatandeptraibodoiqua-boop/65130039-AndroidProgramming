package tna.cntt2.ontapgk2;

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

public class ActivityBaiThuoc extends AppCompatActivity {
    ChiTietBaiAdapter baiThuocAdapter;
    ArrayList<ChiTietBaiActivity> recyclerViewDatas;
    RecyclerView recyclerViewBaiThuoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai_thuoc);
        //3
        recyclerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewBaiThuoc = findViewById(R.id.recyclerBaiThuoc);
        //5
        //RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        //recyclerViewLandscape.setLayoutManager(layoutLinear);
        //RecyclerView.LayoutManager layoutLinearHorizonal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        //recyclerViewLandscape.setLayoutManager(layoutLinearHorizonal);
        RecyclerView.LayoutManager layoutGrid = new GridLayoutManager(this, 1);
        recyclerViewBaiThuoc.setLayoutManager(layoutGrid);
        //6
        baiThuocAdapter = new ChiTietBaiAdapter(this, recyclerViewDatas);
        //7
        recyclerViewBaiThuoc.setAdapter(baiThuocAdapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    ArrayList<ChiTietBaiActivity> getDataForRecyclerView() {
        ArrayList<ChiTietBaiActivity> dsDuLieu = new ArrayList<ChiTietBaiActivity>();

        dsDuLieu.add(new ChiTietBaiActivity("thuoccam", "Thuốc cảm","25/10/2024"));
        dsDuLieu.add(new ChiTietBaiActivity("thuocdaubung", "Thuốc đau bụng","8/9/2025"));
        dsDuLieu.add(new ChiTietBaiActivity("thuocgiamsot", "Thuốc giảm sốt","11/2/2026"));

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