package task1;

public class Truck extends Car {
    private double weightLoad; //ładunek

    public Truck(String name, double tankCapacity, double aveFuelConsumptionPer100Km, boolean airConditioning, double weightLoad) {
        super(name, tankCapacity, aveFuelConsumptionPer100Km, airConditioning);
        this.weightLoad = weightLoad;
    }

    public double getWeightLoad() {
        return weightLoad;
    }

    public void setWeightLoad(double weightLoad) {
        this.weightLoad = weightLoad;
    }

    public double getAveFuelConsumptionPer100KmForTruck() {
        double fuelConsumptionWithAirCondutuining = 1.6;
        if(!super.isAirConditioning()) {
            fuelConsumptionWithAirCondutuining = 0;
        }
        return super.getAveFuelConsumptionPer100Km() + fuelConsumptionWithAirCondutuining + getFuelCombustionLoad();
    }

    private double getFuelCombustionLoad(){
        double fuelPlusPer100Km = 0.5;
        double fuelCombustionLoad = weightLoad*fuelPlusPer100Km/100;
        return fuelCombustionLoad;
    }

    @Override
    public double range() {
        return getTankCapacity()*100/getAveFuelConsumptionPer100KmForTruck();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Ladunek ciężarówki to: " + weightLoad + "kg.";
    }
}
