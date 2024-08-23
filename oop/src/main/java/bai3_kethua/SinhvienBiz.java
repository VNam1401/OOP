package bai3_kethua;

public class SinhvienBiz extends Sinhvien {

    private final double diemMaketing;
    private final double diemsales;

    public SinhvienBiz(String hoten, double diemMaketing, double diemsales) {
        super(hoten, "Kinh doanh");
        this.diemMaketing = diemMaketing;
        this.diemsales = diemsales;
    }

    @Override
    public double Getdiem() {
        return (2 * diemMaketing + diemsales) / 3;
    }
}
