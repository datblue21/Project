//package underground;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class CarList {
//    int n;
//    private ArrayList<Car> carlist;
//    public CarList() {
//
//    }
////    public CarList(Car[] carlist) {
////        this.carlist = carlist;
////    }
//
//    public void NhapDsCar(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so luong: ");
//        n = scanner.nextInt();
//        carlist = new ArrayList<Car>();
//
//        for (int i=0; i <n; i++){
//            System.out.println("Nhap thong tin xe thu "+ (i+1));
//            Car ds = new Car();
////            ds.nhap();
////            carlist.add(ds);
//        }
//    }
//
//
//    public Car[] getCarlist() {
//        return carlist;
//    }
//
//    public void setCarlist(Car[] carlist) {
//        this.carlist = carlist;
//    }
//
//    @Override
//    public String toString() {
//        return "CarList{" +
//                "carlist=" + Arrays.toString(carlist) +
//                '}';
//    }
//
//    public String displayCarList() {
//        for (int i = 0; i < carlist.length; i++) {
//            if (carlist[i].priceForSale() > 20) {
//                carlist[i].toString();
//            }
//        }
//    }
//
////    public String displayCarList() {
////         for (int i = 0; i <5; i++){
////             if (carlist[i].priceForSale())
////         }
////    }
//}
