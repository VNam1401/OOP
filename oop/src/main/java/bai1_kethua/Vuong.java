
import bai1_kethua.Chunhat;

public class Vuong extends Chunhat {

    public Vuong(double canh) {
        super(canh, canh);
    }
    @Override
    public void xuat() {
        System.out.println("canh: " + super.getChuvi()/ 4 +"Dien tich: "+getdientich() + "Chu vi: " + getChuvi());
    }
}
