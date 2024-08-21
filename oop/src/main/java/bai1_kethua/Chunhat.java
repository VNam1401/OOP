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
    public void xuat(){
    
        System.out.println(" HCN__Chieu rong: "+ rong +"Chieu dai: "+dai+"Dien tich: "+getdientich()+"Chu vi"+getChuvi()+".");}
}
