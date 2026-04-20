package thigk2.trannhatan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChiTietBaiHatAdapter extends BaseAdapter {
    //
    private ArrayList<ChiTietBaiHatActivity> dsBaiHat;
    private LayoutInflater layoutInflater;
    private Context context;
    //hàm tạo

    public ChiTietBaiHatAdapter(Context context, ArrayList<ChiTietBaiHatActivity> dsMonAn) {
        this.dsBaiHat = dsMonAn;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsBaiHat.size();
    }

    @Override
    public Object getItem(int i) {
        return dsBaiHat.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        //View item hiện hành
        View viewHienHanh = view;
        // Kiểm tra
        if(viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_baihat, null);
        //Lấy dữ liệu
        ChiTietBaiHatActivity monAnHienTai = dsBaiHat.get(i);
        //Gán lên các điều khiển
        //Tìm điều khiển
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenBaiHat);
        TextView textView_MoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);
        //Set lên
        textView_TenMon.setText(monAnHienTai.getTenBaiHat());
        textView_MoTa.setText(monAnHienTai.getMoTa());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;
    }
}
