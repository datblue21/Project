package sodaps;

public class phanso {
    private int tuso;
    private int mauso;

    //constructor
    public phanso() {
    }

    int getTuso() {
        return tuso;
    }

    void setTuso(int tuso) {
        this.tuso = tuso;
    }

    int getMauso() {
        return mauso;
    }

    void setMauso(int mauso) {
        this.mauso = mauso;
    }

    void nhapphanso(int tuso, int mauso) {
        do {
            System.out.println("nhap tu so");
            getTuso();

            if (mauso == 0) {
                System.out.println("SAI ROI,nhap mau so");
            }
        } while (mauso == 0);
    }

    void xuatphanso() {
        System.out.println(tuso + " / " + mauso);
    }
}
