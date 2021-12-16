package testcasebase;
import java.util.ArrayList;
import java.util.Scanner;
public class Carlist {
    int n;
    private ArrayList<Car> listCar;
    public void nhapDsCar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("-Nhap so luong xe trong danh sach: ");
        n = scan.nextInt();
        listCar = new ArrayList<Car>();

        for(int i=0 ; i< n ; i++) {
            System.out.println("\nThong tin xe thu: " +(i+1));
            Car ds = new Car();
            ds.nhap();
            listCar.add(ds);
        }
    }
    // print list book
    public void xuatDsCar() {
        System.out.print("                                 ----------LIST CAR----------                   ");
        System.out.printf("\n%15s|%15s|%15s|%15s|%15s|%15s|","ID","NAME","QUANTITY","PRICES","EXTRAOUT","PrForSale");
        for(Car ds: listCar) {
            ds.xuat();
        }
        System.out.println();
    }
    // hien ra xe co gia >20
    public void CarPriceMin20() {
        System.out.print("-- DANH SACH O TO >=20");
        System.out.println();
        for(Car dl: listCar) {
            if(dl.priceForSale() >=20) {
                dl.xuat();
            }
        }
        System.out.println();
    }
    // tong so xe o to
    public  void tongSoXeOTo() {
        int dem=0;
        for(Car dl: listCar) {
            dem++;
        }
        System.out.print("-- TỐNG SỐ Ô TÔ TRONG DANH SÁCH LÀ: " +dem);
        System.out.println();
    }
}


