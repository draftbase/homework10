package task2V2;

public class Product extends Form {
    private String name;

    public Product(String name, double a, double b, double c) {
        super(a, b, c);
        this.name = name;
    }

    public Product(String name, double r) {
        super(r);
        this.name = name;
    }

    public Product(String name, double r, double h) {
        super(r, h);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolumeProduct(){
        double vol = 0;
        switch (name) {
            case "Prostopadloscian" :
                vol = getA()*getB()*getC();
                break;
            case "Kula" :
                vol = getR()*Math.PI;
                break;
            default:
                vol = 0;
                break;
        }
        return vol;
    }
}
