package task1;

public class Vehicle {
    private String name;                        //nazwa
    private double tankCapacity;                //pojemoność baku
    private double aveFuelConsumptionPer100Km;  //spalanie na 100 km

    public Vehicle(String name, double tankCapacity, double aveFuelConsumptionPer100Km) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.aveFuelConsumptionPer100Km = aveFuelConsumptionPer100Km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAveFuelConsumptionPer100Km() {
        return aveFuelConsumptionPer100Km;
    }

    public void setAveFuelConsumptionPer100Km(double aveFuelConsumptionPer100Km) {
        this.aveFuelConsumptionPer100Km = aveFuelConsumptionPer100Km;
    }

    //zasięg pojazdu
    public double range() {
        return tankCapacity*100/aveFuelConsumptionPer100Km;
    }

    public String getInfo(){
        return "Pojazd: " + getName() + ", pojemność baku to " + getTankCapacity()
                + " litrów, a średnie spalanie " + getAveFuelConsumptionPer100Km() + " l/100km.";
    }
}
