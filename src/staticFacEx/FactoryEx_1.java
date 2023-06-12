package staticFacEx;

// Static Factory Method
class Car {
    private String name;
    private int door;
    private int oil;

    Car() {}

    private Car(String name, int door, int oil) {
        this.name = name;
        this.door = door;
        this.oil  = oil;
    }

    public static Car createOilCar(String name, int door, int oil) {
        return new Car(name, door, oil);
    }

    public static Car CreateElectricCar(String name, int door) {
        return new Car(name, door, 0);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", door=" + door +
                ", oil=" + oil +
                '}';
    }
}

public class FactoryEx_1 {
    public static void main(String[] args) {
        Car oilCar = Car.createOilCar("셀토스", 4, 300);
        Car elecCar = Car.CreateElectricCar("테슬라", 4);

        System.out.println("oilCar = " + oilCar);
        System.out.println("elecCar = " + elecCar);

    }
}
