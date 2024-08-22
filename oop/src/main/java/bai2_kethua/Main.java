/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2_kethua;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTHONG TIN HINH TRON");
        System.out.print("Nhap ban kinh hinh tron: ");
        double bankinhtron = sc.nextDouble();
        Hinhtron htron = new Hinhtron(bankinhtron);
        htron.xuat();

        System.out.println("\nTHONG TIN HINH TRU:");
        System.out.print("Nhap ban kinh hinh tru: ");
        double bankinhtru = sc.nextDouble();
        System.out.print("Nhap chieu cao hinh tru: ");
        double chieucaotru = sc.nextDouble();
        Hinhtru htru = new Hinhtru(bankinhtru, chieucaotru);
        htru.xuat();
    }
}
