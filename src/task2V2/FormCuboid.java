package task2V2;

public class FormCuboid extends Form{
    private double a;
    private double b;
    private double c;

    public FormCuboid(String type, double a, double b, double c) {
        super(type);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getVolume(){
        return a*b*c;
    }
}
