/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2_kethua;

/**
 *
 * @author ADMIN
 */
public class Hinhtru extends Hinhtron {

    private double chieucao;

    public Hinhtru() {
    }

    public Hinhtru(double bankinh, double chieucao) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double tinhthetich() {
        return tinhdientich() * chieucao;
    }

    public double tinhDienTich() {
        double bankinh = getBankinh();
        return Math.PI * 2 * bankinh * (bankinh + chieucao);
    }

    @Override
    public void xuat() {
        System.out.println("HTRU_Ban kinh: " + getBankinh() + "Chieu cao: " + chieucao + "Dien tich: " + tinhDienTich() + "The tich: " + tinhDienTich());
    }
}
