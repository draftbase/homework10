package task1;

public class Car extends Vehicle {
    private boolean airConditioning; //czy jest włączona klimatyzacja

    public Car(String name, double tankCapacity, double aveFuelConsumptionPer100Km, boolean airConditioning) {
        super(name, tankCapacity, aveFuelConsumptionPer100Km);
        this.airConditioning = airConditioning;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public double getAveFuelConsumptionPer100Km() {
        double aveFuelConsumption = 0;
        if(isAirConditioning()) {
            aveFuelConsumption = super.getAveFuelConsumptionPer100Km() + 0.8;
        } else {
            aveFuelConsumption = super.getAveFuelConsumptionPer100Km();
        }
        return aveFuelConsumption;
    }

    @Override
    public double range() {
        return getTankCapacity()*100/getAveFuelConsumptionPer100Km();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Klimatyzacja jest " + isAirConditioning() + ".";
    }
}
