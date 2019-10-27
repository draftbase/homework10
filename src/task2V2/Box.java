package task2V2;

public class Box extends Form {
    private String type;

    public Box(String type, double a, double b, double c) {
        super(a, b, c);
        this.type = type;
    }

    public Box(String type, double r) {
        super(r);
        this.type = type;
    }

    public Box(String type, double r, double h) {
        super(r, h);
        this.type = type;
    }

    public double getVolumeBox(){
        double vol = 0;
        switch (type) {
            case "Prostopadloscian" :
                vol = getA()*getB()*getC();
                break;
            case "Cylinder" :
                vol = getR()*getH();
                break;
            default:
                //System.out.println("nie ma takiego pudełka");
                vol = 0;
                break;
        }
        return vol;
    }
}
