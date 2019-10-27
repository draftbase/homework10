package task2V2;

public class FormCylinder extends Form {
    private double r;
    private double h;

    public FormCylinder(String type, double r, double h) {
        super(type);
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getVolume(){
        return Math.pow(r,2)*h;
    }
}
