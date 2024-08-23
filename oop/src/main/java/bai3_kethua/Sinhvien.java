
package bai3_kethua;

public abstract class Sinhvien {

    public String hoten;
    public String nghanh;

    public Sinhvien(String hoten, String nghanh) {
        this.hoten = hoten;
        this.nghanh = nghanh;
    }

    public abstract double Getdiem();

    public String Gethocluc() {
        double diem = Getdiem();
        if (diem < 5) {
            return "Yeu";
        } else if (diem < 6.5) {
            return "Trung binh";
        } else if (diem < 7.5) {
            return "Kha";
        } else if (diem < 9) {
            return "Gioi";
        } else {
            return "Xuat sac";
        }
    }

    public void Xuat() {
        System.out.println("SINHVIEN" + " Ho ten: " + hoten + " Nghanh: " + nghanh + " Diem" + Getdiem() + " Hoc luc: " + Gethocluc());
        
    }
}
