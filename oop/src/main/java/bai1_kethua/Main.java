package bai1_kethua;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("\n THONG TIN HINH CHU NHAT");
        Chunhat cn = new Chunhat(3, 4);
                cn.xuat();

        System.out.println("\n THONG TIN HINH VUONG");
        Chunhat vg = new Chunhat(3, 3);
        vg.xuat();
    }

}
