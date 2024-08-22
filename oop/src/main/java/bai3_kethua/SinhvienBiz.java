/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3_kethua;

/**
 *
 * @author ADMIN
 */
public class SinhvienBiz extends Sinhvien {

    public double diemMaketing;
    public double diemsales;

    public SinhvienBiz(String hoten, double diemMaketing, double diemsales) {
        this.diemMaketing = diemMaketing;
        this.diemsales = diemsales;
    }

    public double getdiem() {
        return (2 * diemMaketing + diemsales) / 3;
    }

}
