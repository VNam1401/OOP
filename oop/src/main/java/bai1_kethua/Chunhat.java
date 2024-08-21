/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1_kethua;
public class Chunhat {

    public double rong;
    public double dai;

    public Chunhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuvi() {
        return (dai + rong) * 2;
    }

    public double getdientich() {
        return dai * rong;
    }
}
