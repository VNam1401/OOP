package bai_2.OOP;

import bai_2.*;

public class Main {
    public static void main(String[] args) {
          // Tao 2 tk account
        Account myac = new Account("1", "Nguyen Van Nam", 1000);
        Account frac = new Account("2", "Lieu Nhu Yen", 500);
        // Gui tien vao tk1 (1200)
        myac.credit(200);
        // Rut tien tk1 (1050)
        myac.debit(150);
        // Chuyen tien tk1(950) sang tk2(600.)
        myac.transferTo(frac, 100);

        //    Gui tien vao tk2(1150)
        frac.credit(300);
        // Rut tien tk2 ()
        frac.debit(50);
        // Chuyen tien tk2 sang tk1
        frac.transferTo(myac, 200);
        // Hien thi thong tin tk
        System.out.println("Thong tin tai khoan cua toi:");
        myac.display();
        System.out.println("\nThong tin tai khoan cua nguoi ban:");
        frac.display();
    }
}
