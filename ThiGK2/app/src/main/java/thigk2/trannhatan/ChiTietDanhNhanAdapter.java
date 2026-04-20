package thigk2.trannhatan;

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
public class ChiTietDanhNhanAdapter extends RecyclerView.Adapter<ChiTietDanhNhanAdapter.ItemDanhNhanHolder>{
    Context context;
    ArrayList<ChiTietDanhNhanActivity> lstData;

    public ChiTietDanhNhanAdapter(Context context, ArrayList<ChiTietDanhNhanActivity> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ItemDanhNhanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_danhnhan, parent, false);
        ItemDanhNhanHolder viewholderCreated = new ItemDanhNhanHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemDanhNhanHolder holder, int position) {
        // Lấy đối tượng hiển thị
        ChiTietDanhNhanActivity baiThuocHienThi = lstData.get(position);
        // Trích thông tin
        String caption = baiThuocHienThi.getDanhNhanCation();
        String tenFileAnh = baiThuocHienThi.getBaiThuocImageFileName();
        String QueQuan = baiThuocHienThi.getQueQuan();
        // Đặt vào các trường thông tin của holder
        holder.tvCation.setText(caption);
        holder.tvThoiGian.setText(QueQuan);
        // Đặt ảnh
        String packageName = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packageName);
        holder.ivBaiThuoc.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemDanhNhanHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCation;
        TextView tvThoiGian;
        ImageView ivBaiThuoc;
        public ItemDanhNhanHolder(@NonNull View itemView) {
            super(itemView);
            tvCation = itemView.findViewById(R.id.textView);
            tvThoiGian = itemView.findViewById(R.id.textView2);
            ivBaiThuoc = itemView.findViewById(R.id.imageViewDanhNhan);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //Code ở đây
            int viTriDuocClick = getAdapterPosition();
            ChiTietDanhNhanActivity phanTuDuocClick = lstData.get(viTriDuocClick);
            // Bóc thông tin
            String ten = phanTuDuocClick.getDanhNhanCation();
            String tenFile = phanTuDuocClick.getBaiThuocImageFileName();
            // Toast tên
            String chuoiThongBao = "Bạn vừa click vào: " + ten;
            Toast.makeText(v.getContext(), chuoiThongBao, Toast.LENGTH_SHORT).show();
        }
    }
}
