package task2V2;

public class Form {
    private double a;
    private double b;
    private double c;
    private double r;
    private double h;

    public Form(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Form(double r) {
        this.r = r;
    }

    public Form(double r, double h) {
        this.r = r;
        this.h = h;
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

}
