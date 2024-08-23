
package bai3_kethua;

import java.util.Scanner;
import java.util.ArrayList;

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
        System.out.print("So luong sinh vien: ");
        int soluong = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < soluong; i++) {
            System.out.println("Thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ho ten: ");
            String hoten = sc.nextLine();
            System.out.print("Nghanh hoc (1=>IT<->2=>Biz): ");
            int nghanh = sc.nextInt();

            switch (nghanh) {
                case 1:
                    System.out.print("Diem Java: ");
                    double diemjava = sc.nextDouble();
                    System.out.print("Diem HTML: ");
                    double diemhtml = sc.nextDouble();
                    System.out.print("Diem CSS: ");
                    double diemcss = sc.nextDouble();
                    Quanlysinhvien.add(new SinhvienIT(hoten, diemjava, diemcss, diemhtml));
                    break;
                case 2:
                    System.out.print("Diem Marketing: ");
                    double diemMarketing = sc.nextDouble();
                    System.out.print("Diem Sales: ");
                    double diemSales = sc.nextDouble();
                    Quanlysinhvien.add(new SinhvienBiz(hoten, diemMarketing, diemSales));
                    break;
                default:
                    System.out.println("Nghanh khong hop le.");
            }
            sc.nextLine();
        }
    }

    private static void xuat() {
        
       for (Sinhvien sv : Quanlysinhvien) {
            sv.Xuat();
        }
    }

    private static void svgioi() {
        for (Sinhvien sv : Quanlysinhvien) {
            if (sv.Gethocluc().equals("Gioi")) {
                sv.Xuat();
                System.out.println();
            }
        }
    }

    private static void sapxep() {
        Quanlysinhvien.sort((sv1, sv2) -> Double.compare(sv2.Getdiem(), sv1.Getdiem())); // giam dan(654)
        System.out.println("Sinh vien da duoc sap xep.");
    }
}
