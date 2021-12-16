package testcasebase;

import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        // write your code here
        Carlist dl = new Carlist();
        Scanner scan = new Scanner(System.in);
        int chon;
        do {
            System.out.println("----------------------------");
            System.out.println("LIST BOOK");
            System.out.println("1.NHAP XE OTO");
            System.out.println("2.XUAT XE O TO");
            System.out.println("3.DANH SACH O TO CO GIA >=20");
            System.out.println("4.TONG SO O TO TRONG DANH SACH");
            System.out.println("0.THOAT CHUONG TRINH!!!");
            System.out.print("\n Chon chuc nang: ");
            chon = scan.nextInt();
            switch(chon) {
                case 1: dl.nhapDsCar(); break;
                case 2: dl.xuatDsCar(); break;
                case 3: dl.CarPriceMin20(); break;
                case 4: dl.tongSoXeOTo(); break;
                case 0: System.out.println("Thoat"); break;
                default : System.out.println("bạn chọn không đúng chức năng trên");
                    System.exit(0);
                    break;
            }
        }while(chon!=0);
    }
}


