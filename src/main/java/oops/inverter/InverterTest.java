package oops.inverter;

public class InverterTest {
    public static void main(String[] args) {
        PCU pcu = new PCU(10,220,100,0.8);
        GTI gti = new GTI(15,220,0.85);
        Regalia regalia = new Regalia(20,220,0.9);
        ICruze iCruze = new ICruze(25,220,50);
        Zelio zelio = new Zelio(24,220,99);
        System.out.println(pcu.getPowerRating());
        System.out.println(gti.getPowerRating());
        System.out.println(regalia.getPowerRating());
        System.out.println(iCruze.getPowerRating());
        System.out.println(zelio.getPowerRating());
    }
}
class SolarInverter{
    double current;
    double operatingVoltage;
    boolean hasBattery;
    boolean isGridOn;
    double solarPanelEfficiency;
    public SolarInverter(double current,double operatingVoltage,boolean hasBattery, boolean isGridOn, double solarPanelEfficiency){
        this.current = current;
        this.operatingVoltage = operatingVoltage;
        this.hasBattery = hasBattery;
        this.isGridOn = isGridOn;
        this.solarPanelEfficiency = solarPanelEfficiency;
    }
    public double getPowerRating(){
        return current * operatingVoltage;
    }

    public double getSolarEnergyProduced(double solarRadiation){
        return solarRadiation * solarPanelEfficiency;
    }

}
class PCU extends SolarInverter{
    private final double batteryCapacity;
    public PCU(double current,double operatingVoltage,double batteryCapacity,double solarPanelEfficiency){
        super(current,operatingVoltage,true,false,solarPanelEfficiency);
        this.batteryCapacity = batteryCapacity;
    }
    public double getBatteryEnergyStored(double solarRadiation){
        return getSolarEnergyProduced(solarRadiation);
    }
}
class GTI extends SolarInverter{
    public GTI(double current,double operatingVoltage, double solarPanelEfficiency){
        super(current,operatingVoltage,false,true,solarPanelEfficiency);
    }
    public double getBatteryEnergyStored(double solarRadiation){
        return 0;
    }
}
class Regalia extends SolarInverter{
    public Regalia(double current, double operatingVoltage, double solarPanelEfficiency) {
        super(current, operatingVoltage, true, true, solarPanelEfficiency);
    }
    public double getBatteryEnergyStored(double solarRadiation) {
        return getSolarEnergyProduced(solarRadiation);
    }
}
class NormalInverter{
    double current;
    double operatingVoltage;
    final double batteryCapacity;
    public NormalInverter(double current,double operatingVoltage,double batteryCapacity){
        this.current = current;
        this.batteryCapacity = batteryCapacity;
        this.operatingVoltage = operatingVoltage;
    }

    public double getPowerRating() {
        return current * operatingVoltage;
    }
}
class ICruze extends NormalInverter{
    public ICruze(double current,double operatingVoltage,double batteryCapacity){
        super(current,operatingVoltage,batteryCapacity);
    }

}
class Zelio extends NormalInverter{
    public Zelio(double current,double operatingVoltage,double batteryCapacity){
        super(current,operatingVoltage,batteryCapacity);
    }
}
