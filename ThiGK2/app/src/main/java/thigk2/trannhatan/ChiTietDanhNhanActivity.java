package thigk2.trannhatan;

public class ChiTietDanhNhanActivity {
    String DanhNhanImageFileName;
    String DanhNhanCation;
    String QueQuan;

    public ChiTietDanhNhanActivity(String baiThuocImageFileName, String baiThuocCation, String thoiGian) {
        this.DanhNhanImageFileName = baiThuocImageFileName;
        this.DanhNhanCation = baiThuocCation;
        this.QueQuan = thoiGian;
    }

    public String getBaiThuocImageFileName() {
        return DanhNhanImageFileName;
    }

    public void setBaiThuocImageFileName(String baiThuocImageFileName) {
        DanhNhanImageFileName = baiThuocImageFileName;
    }

    public String getDanhNhanCation() {
        return DanhNhanCation;
    }

    public void setDanhNhanCation(String danhNhanCation) {
        DanhNhanCation = danhNhanCation;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String queQuan) {
        QueQuan = queQuan;
    }
}
