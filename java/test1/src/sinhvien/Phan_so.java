package sinhvien;

public class Phan_so {
    private int tu_so;
    private int mau_so;

    public Phan_so() {
    }

    public int gettu_so() {
        return tu_so;
    }

    public void settu_so(int tu_so) {
        this.tu_so = tu_so;
    }

    ;

    public int getmau_so() {
        return mau_so;
    }

    public void setmau_so(int mau_so) {
        this.mau_so = mau_so;
    }

    @Override
    public String toString() {
        return "Phan_so{" +
                "tu_so=" + tu_so +
                ", mau_so=" + mau_so +
                '}';
    }

    public int UCLN(int a, int b) {
        if (a < 0)
            a *= -1;
        if (b < 0)
            b *= -1;
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void Rutgonphanso() {
        int UCLN (tu_so, mau_so);
        tu_so /= UCLN;
        mau_so /= UCLN;
    }

    public Phan_so Tinhtong(Phan_so x) {
        Phan_so Tong = null;
        Tong.tu_so = tu_so * x.mau_so + mau_so * x.mau_so;
        Tong.mau_so = mau_so * x.mau_so;
    }
}
