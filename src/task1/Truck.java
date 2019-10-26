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

    @Override
    public double getAveFuelConsumptionPer100Km() {
        double aveFuelConsumption = 0;
        if(super.isAirConditioning()) {
            aveFuelConsumption = super.getAveFuelConsumptionPer100Km() + 0.8 + getFuelCombustionLoad();
        } else {
            aveFuelConsumption = super.getAveFuelConsumptionPer100Km() + getFuelCombustionLoad();
        }

        return aveFuelConsumption;
    }

    private double getFuelCombustionLoad(){
        double fuelCombustionLoad = 0;
        if(getWeightLoad() == 0) {
            fuelCombustionLoad = 0;
        } else {
            fuelCombustionLoad = getWeightLoad()*0.5/100;
        }
        return fuelCombustionLoad;
    }

    @Override
    public double range() {
        return getTankCapacity()*100/getAveFuelConsumptionPer100Km();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Ladunek ciężarówki to: " + getWeightLoad() + "kg.";
    }
}
