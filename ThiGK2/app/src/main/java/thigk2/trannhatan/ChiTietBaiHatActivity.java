package thigk2.trannhatan;

public class ChiTietBaiHatActivity {
    private String tenBaiHat;
    private String moTa;
    private int idAnhMinhHoa;
    // hàm tạo

    public ChiTietBaiHatActivity(String tenBaiHat, String moTa, int idAnhMinhHoa) {
        this.tenBaiHat = tenBaiHat;
        this.moTa = moTa;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }

    //Các getter và setter
    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
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
