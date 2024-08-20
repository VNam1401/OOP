package bai_1_OOP;

import java.awt.Rectangle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ractangle t1, t2;
        System.out.print("Tao t1");
        t1 = new Ractangle();
        System.out.print("Tao t1");
        t2 = new Ractangle();
        System.out.print("chieu dai la: ");
        double dai = sc.nextDouble();
        System.out.print("Chieu rong la: ");
        double rong = sc.nextDouble();
        t2 = new Ractangle(dai, rong);
        System.out.println("Thong tin ket qua ");
        System.out.println("HCN t1: dai:" + t1.getdai(dai) + " -rong: " + t1.getrong() + "-dientich" + t1.tinhdientich() + "-chuvi" + t1.tinhchuvi());
        System.out.println("HCN t2: dai:" + t2.getdai(dai) + " -rong: " + t2.getrong() + "-dientich" + t2.tinhdientich() + "-chuvi" + t2.tinhchuvi());

    }
}
