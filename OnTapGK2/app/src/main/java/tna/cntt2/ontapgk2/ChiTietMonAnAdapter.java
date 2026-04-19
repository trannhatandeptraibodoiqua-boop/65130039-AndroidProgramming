package tna.cntt2.ontapgk2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ChiTietMonAnAdapter extends BaseAdapter {
    //
    private ArrayList<ChiTietMonActivity> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;
    //hàm tạo

    public ChiTietMonAnAdapter(Context context, ArrayList<ChiTietMonActivity> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
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
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
        //Lấy dữ liệu
        ChiTietMonActivity monAnHienTai = dsMonAn.get(i);
        //Gán lên các điều khiển
        //Tìm điều khiển
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.tvDonGia);
        TextView textView_MoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);
        //Set lên
        textView_TenMon.setText(monAnHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_MoTa.setText(monAnHienTai.getMoTa());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;
    }
}
