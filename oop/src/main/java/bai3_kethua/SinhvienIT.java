
package bai3_kethua;

public class SinhvienIT extends Sinhvien {

    public double diemjava;
    public double diemcss;
    public double diemhtml;

    public SinhvienIT( String hoten, double diemjava, double diemcss, double diemhtml) {
        super(hoten,"Cong nghe thong ");
        this.diemjava = diemjava;
        this.diemcss = diemcss;
        this.diemhtml = diemhtml;
    }

    @Override
    public double Getdiem() {
        return (2 * diemjava + diemhtml + diemcss) / 4;
    }
}
