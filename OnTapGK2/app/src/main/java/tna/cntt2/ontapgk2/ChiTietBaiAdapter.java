package tna.cntt2.ontapgk2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChiTietBaiAdapter extends RecyclerView.Adapter<ChiTietBaiAdapter.ItemBaiThuocHolder> {
    Context context;
    ArrayList<ChiTietBaiActivity> lstData;

    public ChiTietBaiAdapter(Context context, ArrayList<ChiTietBaiActivity> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemBaiThuocHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_thuoc, parent, false);
        ItemBaiThuocHolder viewholderCreated = new ItemBaiThuocHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemBaiThuocHolder holder, int position) {
        // Lấy đối tượng hiển thị
        ChiTietBaiActivity baiThuocHienThi = lstData.get(position);
        // Trích thông tin
        String caption = baiThuocHienThi.getBaiThuocCation();
        String tenFileAnh = baiThuocHienThi.getBaiThuocImageFileName();
        String thoiGian = baiThuocHienThi.getThoiGian();
        // Đặt vào các trường thông tin của holder
        holder.tvCation.setText(caption);
        holder.tvThoiGian.setText(thoiGian);
        // Đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packageName);
        holder.ivBaiThuoc.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemBaiThuocHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCation;
        TextView tvThoiGian;
        ImageView ivBaiThuoc;
        public ItemBaiThuocHolder(@NonNull View itemView) {
            super(itemView);
            tvCation = itemView.findViewById(R.id.textView);
            tvThoiGian = itemView.findViewById(R.id.textView2);
            ivBaiThuoc = itemView.findViewById(R.id.imageViewBaiThuoc);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //Code ở đây
            int viTriDuocClick = getAdapterPosition();
            ChiTietBaiActivity phanTuDuocClick = lstData.get(viTriDuocClick);
            // Bóc thông tin
            String ten = phanTuDuocClick.getBaiThuocCation();
            String tenFile = phanTuDuocClick.getBaiThuocImageFileName();
            // Toast tên
            String chuoiThongBao = "Bạn vừa click vào: " + ten;
            Toast.makeText(v.getContext(), chuoiThongBao, Toast.LENGTH_SHORT).show();
        }
    }
}
