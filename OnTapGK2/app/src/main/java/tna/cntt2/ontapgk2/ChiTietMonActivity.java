package tna.cntt2.ontapgk2;

public class ChiTietMonActivity {
    private String tenMonAn;
    private double donGia;
    private String moTa;
    private int idAnhMinhHoa;
    // hàm tạo

    public ChiTietMonActivity(String tenMonAn, double donGia, String moTa, int idAnhMinhHoa) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTa = moTa;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
    //Các getter và setter

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }

    public void setIdAnhMinhHoa(int idAnhMinhHoa) {
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
}
