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

    public double getAveFuelConsumptionPer100KmForCar() {
        double fuelConsumptionWithAirCondutuining = 0.8;
        if(!isAirConditioning()) {
            fuelConsumptionWithAirCondutuining = 0;
        }
        return super.getAveFuelConsumptionPer100Km() + fuelConsumptionWithAirCondutuining;
    }

    @Override
    public double range() {
        return getTankCapacity()*100/getAveFuelConsumptionPer100KmForCar();
    }

    @Override
    public String getInfo() {
        //return super.getInfo() + " Klimatyzacja jest " + airConditioning + ".";
        return "Pojazd: " + getName() + ", pojemność baku to " + getTankCapacity()
                + " litrów, a średnie spalanie " + getAveFuelConsumptionPer100KmForCar()
                + " l/100km." + " Klimatyzacja jest " + airConditioning + "."
                + " Zasięg pojazdu to " + range() + " km.";
    }
}
