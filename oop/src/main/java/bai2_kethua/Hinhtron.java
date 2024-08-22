/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_kethua;

/**
 *
 * @author ADMIN
 */
public class Hinhtron {
    private double bankinh;
    public Hinhtron() {    }
    public Hinhtron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    
    public double tinhdientich() {
        return Math.PI * bankinh * bankinh;
    }
    public double tinhchuvi() {
        return Math.PI *2 * bankinh;
    }
    public void xuat() {
        System.out.print("HTRON_Ban kinh: " + bankinh+ "Dien tich: "+tinhdientich()+"Chu vi: "+tinhchuvi());
    }
}
