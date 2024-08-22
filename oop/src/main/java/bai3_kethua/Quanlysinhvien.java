/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3_kethua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//import java.util.Comparator;
//import java.util.Scanner;
public class Quanlysinhvien {

    static ArrayList<Sinhvien> Quanlysinhvien = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----QUAN LY SINH VIEN-----");
        System.out.println("1. Nhap danh sach sinh vien");
        System.out.println("2. Xuat danh sach sinh vien");
        System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
        System.out.println("4. Sap xep danh sach sinh vien theo diem");
        System.out.println("5. Ket thuc");
        System.out.print("Click number(1=>5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                nhap();
                break;
            case 2:
                xuat();
                break;
            case 3:
                svgioi();
                break;
            case 4:
                sapxep();
                break;
            case 5:
                System.out.println("Ket thuc chuong trinh.");
                System.exit(0);
            default:
                System.out.println("Khong hop le. vui long chon lai.");
        }
    }

    private static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho ten: ");
        String hoten = sc.nextLine();
        System.out.print("Nghanh: ");
        String nghanh = sc.nextLine();
        System.out.print("Diem: ");
        double diem = sc.nextDouble();
        System.out.print("Hoc luc: ");
        String hocluc = sc.nextLine();
    }

    private static void xuat() {
    }

    private static void svgioi() {
    }

    private static void sapxep() {
    }

}
