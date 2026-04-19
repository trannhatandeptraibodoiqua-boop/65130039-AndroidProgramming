package tna.cntt2.ontapgk2;

public class ChiTietBaiActivity {
    String BaiThuocImageFileName;
    String BaiThuocCation;
    String ThoiGian;

    public ChiTietBaiActivity(String baiThuocImageFileName, String baiThuocCation, String thoiGian) {
        this.BaiThuocImageFileName = baiThuocImageFileName;
        this.BaiThuocCation = baiThuocCation;
        this.ThoiGian = thoiGian;
    }

    public String getBaiThuocImageFileName() {
        return BaiThuocImageFileName;
    }

    public void setBaiThuocImageFileName(String baiThuocImageFileName) {
        BaiThuocImageFileName = baiThuocImageFileName;
    }

    public String getBaiThuocCation() {
        return BaiThuocCation;
    }

    public void setBaiThuocCation(String baiThuocCation) {
        BaiThuocCation = baiThuocCation;
    }

    public String getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(String thoiGian) {
        ThoiGian = thoiGian;
    }
}
