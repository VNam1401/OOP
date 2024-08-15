package OOPbai1;

public class Ractangle {

    private double dai;
    private double rong;

    public Ractangle() {
    }

    public Ractangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getdai(double dai) {
        return dai;
    }

    public void setdai(double dai) {
        this.dai = dai;
    }

    public double getrong() {
        return rong;
    }

    public void setrong(double rong) {
        this.rong = rong;
    }

    public double tinhdientich() {
        double tinhdientich = dai * rong;
        return tinhdientich;
    }

    public double tinhchuvi() {
        double tinhchuvi = (dai + rong) * 2;
        return tinhchuvi;
    }

}
