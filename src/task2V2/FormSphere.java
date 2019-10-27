package task2V2;

public class FormSphere extends Form {
    private double r;

    public FormSphere(String type, double r) {
        super(type);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getVolume(){
        return Math.pow(r,2)*Math.PI;
    }
}
