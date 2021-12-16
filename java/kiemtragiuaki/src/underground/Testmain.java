package underground;

public class Testmain {
    public static void main(String[] args) {
        Car car = new Car(1, "nam", 30, 40, 40);
//        CarList sc = new CarList();
//        car.setExtraOut(10);
//        car.setQuantity(50);
        System.out.println("------------------");
        System.out.println(car.priceForSale());
        System.out.println(car.toString());
        System.out.println("------------------\n");
//        CarList cararray = new CarList();


    }
}
