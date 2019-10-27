package task2V2;

public class Shop {
    public static void main(String[] args) {
        //deklaracja dostępnych pudełek
        Box[] boxes = new Box[8];
        boxes[0] = new Box("Prostopadloscian", 5,5,5);
        boxes[1] = new Box("Prostopadloscian", 10,10,10);
        boxes[2] = new Box("Prostopadloscian", 15,15,15);
        boxes[3] = new Box("Prostopadloscian", 20,20,20);
        boxes[4] = new Box("Cylinder", 5,5);
        boxes[5] = new Box("Cylinder", 10,10);
        boxes[6] = new Box("Cylinder", 15,15);
        boxes[7] = new Box("Cylinder", 20,20);

        //deklaracja produktu
        Product product1 = new Product("Prostopadloscian", 7,7,7);
        Product product2 = new Product("Kula", 11,10);

        //obliczenia w poszukiwaniu optymalnego pudelka
        Calculations calculations = new Calculations(boxes);
        System.out.println(calculations.optimalBox(product1));
        System.out.println(calculations.optimalBox(product2));

    }
}
