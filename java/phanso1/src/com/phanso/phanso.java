package com.phanso;
public class phanso {
    private int tuso;
    private int mauso;

    //constructor
    public phanso() {
    }

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    public void nhapphanso(phanso phanso) {
        System.out.println("nhap tu so");
        public int getTuso() {
            return tuso;
        }

        public void setTuso(int tuso) {
            this.tuso = tuso;
        }

        do {
            System.out.println("Nhap mau so");
            public int getMauso() {
                return mauso;
            }

            public void setMauso(int mauso) {
                this.mauso = mauso;
            }

            if (mauso == 0) {
                System.out.println("SAI ROI,nhap mau so");
            }
        } while (mauso == 0);
    }

    public void xuatphanso() {
        System.out.println(tuso + " / " + mauso);
    }
}

