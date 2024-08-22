/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3_kethua;

public class SinhvienIT extends Sinhvien {

    public double diemjava;
    public double diemcss;
    public double diemhtml;

    public SinhvienIT(double diemjava, double diemcss, double diemhtml, String hoten) {
//        super(hoten);
        this.diemjava = diemjava;
        this.diemcss = diemcss;
        this.diemhtml = diemhtml;
    }

    
    public double getdiem() {
        return (2 * diemjava + diemhtml + diemcss) / 4;
    }

}
