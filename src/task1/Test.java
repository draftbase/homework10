package task1;

public class Test {
    public static void main(String[] args) {
        Car[] vehicles = new Car[3];
        vehicles[0] = new Car("Skoda", 70, 7, false);
        vehicles[1] = new Car("Ford Focus", 55, 6.7, false);
        vehicles[2] = new Truck("Scania", 1200, 22, false, 12500);

        System.out.println(vehicles[0].getInfo());
        System.out.println(vehicles[1].getInfo());
        System.out.println(vehicles[2].getInfo());

        ((Car)vehicles[0]).setAirConditioning(true);
        ((Car)vehicles[1]).setAirConditioning(true);
        ((Truck)vehicles[2]).setAirConditioning(true);

        System.out.println(vehicles[0].getInfo());
        System.out.println(vehicles[1].getInfo());
        System.out.println(vehicles[2].getInfo());
    }
}
