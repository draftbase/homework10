package task1;

public class Test {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Vehicle("Motor", 15, 4);
        vehicles[1] = new Car("Ford Focus", 55, 6.7, false);
        vehicles[2] = new Truck("Scania", 1200, 22, false, 12500);

        System.out.println(vehicles[0].getInfo());
        System.out.println(vehicles[1].getInfo());
        System.out.println(vehicles[2].getInfo());

        ((Car)vehicles[1]).setAirConditioning(true);
        ((Truck)vehicles[2]).setAirConditioning(true);

        System.out.println(vehicles[1].getInfo());
        System.out.println(vehicles[2].getInfo());
    }
}
