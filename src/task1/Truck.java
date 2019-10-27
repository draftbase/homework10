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
//        if(weightLoad == 0) {
//            fuelCombustionLoad = 0;
//        } else {
//            fuelCombustionLoad = weightLoad*0.5/100;
//        }
        return fuelCombustionLoad;
    }

    @Override
    public double range() {
        return getTankCapacity()*100/getAveFuelConsumptionPer100KmForTruck();
    }

    @Override
    public String getInfo() {
        //return super.getInfo() + " Ladunek ciężarówki to: " + weightLoad + "kg.";
        return "Pojazd: " + getName() + ", pojemność baku to " + getTankCapacity()
                + " litrów, a średnie spalanie " + getAveFuelConsumptionPer100KmForTruck()
                + " l/100km." + " Klimatyzacja jest " + isAirConditioning() + "."
                + " Ladunek ciężarówki to: " + weightLoad + "kg."
                + " Zasięg pojazdu to " + range() + " km.";
    }
}
